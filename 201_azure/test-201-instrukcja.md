## JMeter w Azure

1. Uruchomimy Pipeline jako binarkê z Build Pipeline
2. Uruchomimy Release pipeline z wykorzystaniem Azure Marketplace Task (https://marketplace.visualstudio.com/items?itemName=AlexandreGattiker.jmeter-tasks)
    Change agent to ubuntu latest
    Command Line Task (download repo zip with curl):
        curl -L -O -X GET https://github.com/gabrielstar/charity/archive/refs/heads/master.zip
    JMeter Installer
    Taurus Installer
    Taurus Runner (Taurus Configuration YAML):
    
        execution:
        - scenario:
            script: charity-master/201_azure/test.jmx
        
        reporting:
        - module: junit-xml
          filename: taurus-output/TEST-Taurus.xml
            
    ![spa i mpa](img/releasePipeline.png)
    
            `¿ród³ó: Gabriel Starczewski`
            
3. Uruchomimy Jmetera z pomoc¹ kontenera Dockerowego