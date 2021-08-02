## JMeter w Azure

1. Uruchomimy Release pipeline 

    - Z [Azure Marketplace](https://marketplace.visualstudio.com/items?itemName=AlexandreGattiker.jmeter-tasks) zainstalujemy potrzebne narzêdzia
        - JMeter Installer
        - Taurus Installer/Runner
    
    - Stworzymy pipeline: WejdŸ w Pipeline -> Releases -> New Release Pipeline -> Add Stage (Empty job, Jmeter tests) 
    
    - W 'Agent job' zmieñ 'Agent Specification' na  ubuntu latest. To nasza platforma do automatyzacji.
    - Dodaj nastêpuj¹ce taski do pipeline'a:
    
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
           
    - Uruchom testy tworz¹c nowy release i wdra¿aj¹c go
            
![release](img/releasePipeline.png)
    
`¿ród³ó: Gabriel Starczewski`
            
***
            
C:\Users\gstarczewski\Desktop\gab\jenkins\charity\201_azure\img\pipelineDocker.png
2. Uruchomimy Jmetera z pomoc¹ kontenera Dockerowego - jmeter_from_docker.yaml