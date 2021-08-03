## JMeter w Azure DevOps

Azure DevOps to portal do automatyzacji proces�w deweloperskich, kt�ry mo�e korzysta� z zasob�w Azure (z Azure Portal) jak i spoza niego (no. GitHub) poprzez 
linki, kt�re nazywamy Service Connections.

***

Wykonanie test�w w systemie CI/CD (Azure DevOps lub innym) to nic innego jak automatyzacja. Zanim b�dziemy automatyzowa� musimy wiedzie� co automatyzujemy. Opiszmy wi�c zadanie w postaci krok�w:

- Pobierz repozytorium z testami (wymagane)
- Zainstaluj JMetera (wymagane)
- Uruchom Testy (wymagane)
- Opublikuj wynik test�w (opcjonalne)
- Opublikuj artefakty testowe (opcjonalne)

Do automatyzacji wykorzystujemy pipeline'y. Automatyzacj� implementujemy korzystaj�c z gotowych element�w pipeline'a (step�w) lub rozszerze�, kt�re mo�emy zainstalowa� z Azure Marketplace. 

Pipeline w Azure Devops ma nast�puj�c� [struktur�](https://docs.microsoft.com/en-us/azure/devops/pipelines/yaml-schema?view=azure-devops&tabs=schema%2Cparameter-schema):

```yaml

pipeline:
    stage A:
      job 1:
        step 1.1
        step 1.2
        ...
       job 2:
        step 2.1
        ...
    stage B:
      ...
```

Przyk�adowy prosty pipeline w YAML znajduj� si� w pliku [teoria-pipeline.yaml](teoria-pipeline.yaml)


***

Podstawowe metody puszczania test�w w Azure DevOps na agentach Microsoftu s� nast�puj�ce:

1. **Jako release pipeline**

    Release pipeline'y zosta�y stworzone do wdra�ania aplikacji ale mog� te� s�u�y� do automatyzacji. Polegaj� na r�cznej konfiguracji i na chwil� obecn� nie mo�na ich zapisa� w postaci YAML.

    ![release pipeline](img/releasePipeline.png)

2.  **Jako build pipeline (YAML) z u�yciem binarki**

    W tym podej�ciu definicj� pipeline'u trzymamy w kodzie w pliku YAML a JMetera za ka�dym razem instalujemy tak jak robili�my to w naszym systemie.
        
    ![build pipeline](img/pipelineBinary.png)
    
3. **Jako build pipeline (YAML) z u�yciem kontenera dockerowego**

     W tym podej�ciu nie musimy instalowa� JMetera. Testy zostan� uruchomione w kontenerze Dockerowym, kt�ry ju� go zawiera.
    
    ![docker pipeline](img/pipelineDocker.png) 
 
***

Od 3.2021, �eby m�c wykonywa� pipeline'y na agentach Azure w ramach darmowych subskrypcji musimy zainstalowa� w�asnego agenta. Zrobimy to:
- Tworz�c w Portalu VMk�
- Tworz�c dla niej Bastion
- Loguj�c si� do VMki przez Bastion, zainstalujemy Jav� i wszystko czego b�dzie potrzebowa� nasz pipeline:
    ```shell script
    sudo apt-get update
    sudo apt install openjdk-8-jre-headless
    sudo apt install unzip
    curl -O -L https://vstsagentpackage.azureedge.net/agent/2.189.0/vsts-agent-linux-x64-2.189.0.tar.gz
    mkdir myagent && cd myagent
    tar zxvf ~/Downloads/vsts-agent-linux-x64-2.189.0.tar.gz
   ./config.sh
   #jako URL podajemy nazw� organizacji
   #PAT powinien mie� scope agents management
   ./run.sh
```