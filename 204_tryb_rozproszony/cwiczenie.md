(æwiczenie robimy wspólnie z trener,)

1. W Azure stwórz 3 VM o nazwach j1,j2,j3:

    - Ubuntu 20 +
    - z haslem do logowania
     
2. Stwórz Bastion po stowrzeniu 1 VMki, ¿eby mo¿na siê by³o pod³¹czyæ do nich z przegl¹darki (do 10 minut, dobrze iœæ wtedy na kawê)
4. Na 2 VMkach odpal jmeter-server.sh
5. Na 3-ciej odpal test, który u¿ywa IP pozosta³ych maszyn. (test mo¿esz skopiowaæ CTRL-C, CTRL-V z katalogu æwiczenia na VMkê)

Polecenia do wklejenie w konsoli Bastiona:

          #install
          version=5.4.1 && \
          sudo apt update && \
          sudo apt install unzip && \
          sudo apt install openjdk-8-jre-headless && \
          curl -o ${version}.tgz http://archive.apache.org/dist/jmeter/binaries/apache-jmeter-${version}.tgz && \
          tar -xzf ${version}.tgz
            
          #sprawdŸ IP
          ip addr
          
          #komenda do uruchomienia workera
          cd apache-jmeter-5.4.1/bin
          ./jmeter-server -Dserver.rmi.ssl.disable=true
           
          #pusc test na montrolerze gdzie worker ip to np. 10.0.0.5
          cd apache-jmeter-5.4.1/bin
          ./jmeter -Dserver.rmi.ssl.disable=true -n -t examples/CSVSample.jmx  -R 10.0.0.5
          
![network](img/azure.png)

