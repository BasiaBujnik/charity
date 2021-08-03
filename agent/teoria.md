Od 3.2021, ¿eby móc wykonywaæ pipeline'y na agentach Azure w ramach darmowych subskrypcji musimy zainstalowaæ w³asnego agenta. Zrobimy to:
- Tworz¹c w Portalu VMkê (Standard DS1 v2 (1 vcpus, 3.5 GiB memory))
- Tworz¹c dla niej Bastion (trwa to do 10 minut, dobry moment na kawê...)
- Loguj¹c siê do VMki przez Bastion, zainstalujemy Javê, dockera i wszystko czego bêdzie potrzebowa³ nasz pipeline:

    ```shell script

    #install basic tools
    sudo apt-get update
    sudo apt install openjdk-8-jre-headless
    sudo apt install unzip
    sudo apt install docker.io
  
    #add current user to docker
    sudo groupadd docker 
    sudo usermod -aG docker ${USER} 
    exit #need to logout for docker permissions to refresh
    docker run hello-world #verify docker
  
    #installl powershell - https://docs.microsoft.com/en-us/powershell/scripting/install/installing-powershell-core-on-linux?view=powershell-7.1#ubuntu-2004
    sudo apt-get install -y wget apt-transport-https software-properties-common && \
    wget -q https://packages.microsoft.com/config/ubuntu/20.04/packages-microsoft-prod.deb && \
    sudo dpkg -i packages-microsoft-prod.deb && \
    sudo apt-get update && \
    sudo add-apt-repository universe && \
    sudo apt-get install -y powershell 
    pwsh
  
    #download configure and run agent
    curl -O -L https://vstsagentpackage.azureedge.net/agent/2.189.0/vsts-agent-linux-x64-2.189.0.tar.gz
    mkdir myagent && cd myagent
    tar zxvf ~/Downloads/vsts-agent-linux-x64-2.189.0.tar.gz
   ./config.sh
   #jako URL podajemy nazwê organizacji
   #PAT powinien mieæ scope agents management
   #pool name: Default
   ./run.sh # or ./run.sh &
```