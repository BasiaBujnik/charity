## Tryb rozproszony na maszynach w Azure (to demo robimy wsp�lnie)

Zbudujemy nast�puj�c� topologi� i uruchomimy nasz test w trybie rozproszonym:

![network](img/azure.png)


1. W Azure stw�rz 3 VM o nazwach j1,j2,j3 b�d�ce w tej samej sieci wirtualnej:

    - Ubuntu 20 +
    - Z haslem do logowania zamiast SSH
     
2. Stw�rz Bastion Host po stworzeniu 1 VMki, �eby mo�na si� by�o pod��czy� do nich z przegl�darki (trwa to do 10 minut, dobrze i�� wtedy na kaw�)
4. Na 2 VMkach odpal jmeter-server.sh
5. Na 3-ciej odpal test, kt�ry u�ywa IP pozosta�ych maszyn. (test mo�esz skopiowa� CTRL-C, CTRL-V z katalogu �wiczenia na VMk�)

Polecenia do wklejenie w konsoli Bastiona:
```shell script
#instaluj JMETERa

version=5.4.1 && \
sudo apt update && \
sudo apt install unzip && \
sudo apt install openjdk-8-jre-headless && \
curl -o ${version}.tgz http://archive.apache.org/dist/jmeter/binaries/apache-jmeter-${version}.tgz && \
tar -xzf ${version}.tgz

#sprawd� IP
ip addr

#komenda do uruchomienia workera
cd apache-jmeter-5.4.1/bin
./jmeter-server -Dserver.rmi.ssl.disable=true

#pusc test na montrolerze gdzie worker ip to np. 10.0.0.5
cd apache-jmeter-5.4.1/bin
./jmeter -Dserver.rmi.ssl.disable=true -n -t examples/CSVSample.jmx  -R 10.0.0.5
```

Problem przy testowaniu rozproszonym zaczyna si� pojawia� w momencie gdy chcemy elastycznie skalowa� workery. 

Rozwi�zuje si� go na kilka sposob�w, korzystaj�c z:
- VM Scale Set
- Azure Container Instances
- Azure Kubernetes Service
          

