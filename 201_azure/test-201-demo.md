## JMeter w Azure

1. Uruchomimy Release pipeline 

    - Z [Azure Marketplace](https://marketplace.visualstudio.com/items?itemName=AlexandreGattiker.jmeter-tasks) zainstalujemy potrzebne narz�dzia
        - JMeter Installer
        - Taurus Installer/Runner
    
    - Stworzymy pipeline: Wejd� w Pipeline -> Releases -> New Release Pipeline -> Add Stage (Empty job, Jmeter tests) 
    
    - W 'Agent job' zmie� 'Agent Specification' na  ubuntu latest. To nasza platforma do automatyzacji.
    - Dodaj nast�puj�ce taski do pipeline'a:
    
        -   Command Line Task (download repo zip with curl):
                
             ```shell script
                curl -O -L -X GET https://github.com/gabrielstar/charity/archive/refs/heads/master.zip
                unzip master.zip             
                ls -alh 
               ```
   
         -  JMeter Installer
         -  Taurus Installer
         -  Taurus Runner (Taurus Configuration YAML):
                ```yaml
                execution:
                - scenario:
                    script: charity-master/201_azure/test.jmx
                
                reporting:
                - module: junit-xml
                  filename: taurus-output/TEST-Taurus.xml
                ```    
         - Publish Test Results
           
    - Uruchom testy tworz�c nowy release i wdra�aj�c go
            
![release](img/releasePipeline.png)
    
`�r�d��: Gabriel Starczewski`
            
***
            
C:\Users\gstarczewski\Desktop\gab\jenkins\charity\201_azure\img\pipelineDocker.png
2. Uruchomimy Jmetera z pomoc� kontenera Dockerowego - jmeter_from_docker.yaml