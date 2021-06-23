## Budujemy topologię z wykorzystaniem Azure Portal

1. Otwórz https://portal.azure.com/#create/hub
2. Stwórz grupę zasobów (resource group): nazwa `jmeter-rg`, region : `West Europe`
3. Przejdź do grupy zasobów, kolejne elementy dodawaj w ramach tej grupy zasobów
4. Dodaj i spartycjonuj przestrzeń adresów sieci wirtualnej (virtual network): nazwa `jmeter-vn`, region `West Europe`
   
   
    W zakładce IP addresses:
    - wpisz: 10.0.0.0/26 - to da 64 adresy IP, 10.0.0.0-10.0.0.63
    - stwórz podsieć nr 1 na nasze 2x VMki, 10.0.0.0/29 - to da 3 adresy IP (5 rezerwuje Azure): 10.0.0.0 - 10.0.0.7
    
    W zakładce Security:
    - Aktywuj BastionHost, nazwa: 'jmeter-bastion', subnet 10.0.0.32/27 = 10.0.0.32 - 10.0.0.63
    - Stwórz nowe IP, nazwa 'jmeter-bastion-ip'
    - Tworzenie bastiona może potrwać nawet 20 minut
    
    Kliknij 'Review+Create', 'Create'
    
    Może się przydać: https://www.calculator.net/ip-subnet-calculator.html
    
5. Dodajemy maszyny wirtualne x2 (Virtual Machine):
  
    
    Region: 'West Europe', nazwa: vm1|vm2, Image: 'Ubuntu 20 LTS lub wyżej'
    Autentykacja: Password, public inbound ports: None
    W zakładce Networking: Virtual network: jmeter-vn, subnet: vms, Public IP: None
    Kliknij 'Review+Create', 'Create'
    
    Każda z maszyn zostanie stworzona wraz z zależnymi zasobami: dysk, grupa sieciowa (NSG), interfejs sieciowy (NIC)
     
6. Dodajemy Load Balancer za publicznym IP
   
   
    Region: 'West Europe', nazwa: jmeter-lb, publiczny adres ip: jmeter-lb-ip, Availability Zone: No Zone


7. W tym momencie mamy już wszystkie komponenty, czas na konfigurację
8. Zalogujmy się na każdą VMkę i uruchommy na niej prosty serwer nginx z dockera


    Connect -> Bastion -> Use Bastion, w SSH:
        sudo snap install docker
        sudo docker run --name mynginx -p 80:80 -d nginx
        curl localhost
        sudo docker logs mynginx --follow

9. W tym momencie na obu VMkach chodzą serwisy ale nie są dostępne na zewnątrz. Skonfigurujmy Load Balancer przez dodanie 'backend pool'.

     
    Backend Pools -> Nazwa: vms, Virtual Network: jmeter-vn, dodaj obie VMki
    Kliknij 'Review+Create', 'Create'
    Od tego momentu LB kontroluje Inbound/Outbound traffic i no. sudo docker hello-world nie zadziała już na VMkach.

10. Wpisz w przeglądarce http://{jmeter-lb-ip}. Load Balancer nie wie jeszcze co robić z żądaniami.

    
    Możesz to potwierdzić idąc do VM1|VM2 -> Connection troubleshoot i wykonać test do portu HTTP 80 lub jakikolwiek inny (wychodzący).
    
11. Dodajmy reguły load balancingu, żeby LB wiedział jak dystrybuować ruch:


    Add load balancing rule, nazwa: vms-load-balancing-rule, wybierz IP, port 80, backend pool: vms, 
    Health probe: Create new, nazwa: http-80-probe, proto HTTP, port 80
    Session persistence: None
    Po dodaniu proba powinieneś widzieć requesty na maszynach wirtualnych.
    Dodaj regułę
    
12. Zezwólmy na dostęp do VMek przez dodanie Inbound Security Rule w vm1-nsg, vm2-nsg

    
     Source: Any, Service: HTTP
     Propagacja reguły może zająć do 3 minut
     Po tym czasie wpisując http://{jmeter-lb-ip} zobaczysz swoje IP w logach
     
     
     
13. Aby widzieć topolgię wejdź do NetworkWatcher



    VM1|VM2 -> Extensions -> Add AzureNetworkWatcherExtension