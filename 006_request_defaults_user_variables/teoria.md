## Elementy konfiguracyjne JMetera

Zapamiętaj:

- **Config Elements** - elementy konfiguracyjne mają wpływ na zachowanie innych elementów lub całego JMetera. Najczęściej używane to:
    - HTTP Cookie Manager - zarządza ciasteczkami automatycznie w celu utrzymania sesji użytkownika
    - HTTP Cache Manager - symuluje cache przeglądarki
    - HTTP Request Defaults - pozwala skonfigurować domyślne parametry w jednym miejscu aby uniknąć powtórzeń
    - HTTP Header Manager - dodaje nagłówki do żądania
    - User Defined Variables
        -  User Defined Variables śą definiowane na początku testu. Każdy wątek otrzymuje kopie zmiennej. UDV są dostępne poprzez ${VAR_NAME} w różnych elementach GUI JMetera.
        
       
W JMeterze istnieją 3 rodzaje zmiennych, które poznamy w dalszej części szkolenia:

- properties (props) - mają zasięg globalny, zmiana w jednym miejscu jest widoczna wszędzie
- user defined variables (udv) - są procesowane na samym początku testu, każdy wątek (użytkownik) otrzymuje własną kopię zmiennej 
- variables (vars) - mają zasięg lokalny w ramach bieżącego wątka (uzytkownika)