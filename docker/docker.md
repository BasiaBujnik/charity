### Instalacja Jenkinsa z obrazu dockerowego

Oficjalny obraz dockera znajduje się pod adresem - https://hub.docker.com/r/jenkins/jenkins
Możesz go zainstlować pobierając obraz poleceniem:

```docker pull jenkins/jenkins:lts``` 

a następnie uruchamiając kontener:

```docker run --name jenkins -p 8080:8080  -p 50000:50000 -e JAVA_OPTS="-Djenkins.install.runSetupWizard=false" jenkins/jenkins:lts``` 

----

Jenkins jest gotowy pod adresem: http://localhost:8080/


Aby uruchomić Jenkinsa w trybie 'detached' użyj:

```docker run -d --name jenkins -p 8080:8080 -p 50000:50000 -e JAVA_OPTS="-Djenkins.install.runSetupWizard=false" jenkins/jenkins:lts``` 

Przydatne polecenia:

```docker image ls``` - wyświetla obrazy dockerowe

```docker image ls | Select-String jenkins```  - wyświetla obrazy dockerowe pasujące do slowa 'jenkins'

```docker image ls | Select-String -Pattern jenkins``` - wyświetla obrazy dockerowe pasujące do wyrażenia regularnego 'jenkins'

```docker container ls | Select-String jenkins``` - wyświetla kontnery dockerowe pasujące do slowa 'jenkins'

```docker container stop jenkins ``` - zatrzymuje kontener o danej nazwie

```docker container start jenkins``` - startuje kontener o danej nazwie

```docker container rm jenkins``` - usuwa kontener

`` docker exec -it jenkins /bin/bash`` - nawiązuje polaczenie z terminalem uruchomionego kontenera

`` docker image rm jenkins/jenkins:lts `` - usuwa obraz z dysku 


---

Aby zamontować kontener z wolumenem, można użyc:

```docker run --name jenkins -p 8080:8080 -p 50000:50000 -v jenkins_home:/var/jenkins_home jenkins/jenkins:lts```

Uwaga: Opcja ta bywa problematyczna na maszynach Windows 10