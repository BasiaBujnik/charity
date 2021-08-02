## JMeter w Azure

1. Uruchomimy Release pipeline 

    - Z [Azure Marketplace](https://marketplace.visualstudio.com/items?itemName=AlexandreGattiker.jmeter-tasks) zainstalujemy potrzebne narzędzia
        - JMeter Installer
        - Taurus Installer/Runner
    
    - Stworzymy pipeline: Wejdź w Pipeline -> Releases -> New Release Pipeline -> Add Stage (Empty job, Jmeter tests) 
    
    - W 'Agent job' zmień 'Agent Specification' na  ubuntu latest. To nasza platforma do automatyzacji.
    - Dodaj następujące taski do pipeline'a:
    
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
           
    - Uruchom testy tworząc nowy release i wdrażając go
            
![release](img/releasePipeline.png)
    
`żródłó: Gabriel Starczewski`
            
***
            
C:\Users\gstarczewski\Desktop\gab\jenkins\charity\201_azure\img\pipelineDocker.png
2. Uruchomimy Jmetera z pomocą kontenera Dockerowego - jmeter_from_docker.yaml