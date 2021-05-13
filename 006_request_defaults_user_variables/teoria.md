## Elementy konfiguracyjne JMetera

Zapamiętaj:

- **Config Elements** - elementy konfiguracyjne mają wpływ na zachowanie innych elementów lub całego JMetera. Najczęściej używane to:
    - HTTP Cookie Manager - zarządza ciasteczkami automatycznie w celu utrzymania sesji użytkownika
    - HTTP Cache Manager - symuluje cache przeglądarki
    - HTTP Request Defaults - pozwala skonfigurować domyślne parametry w jednym miejscu aby uniknąć powtórzeń
    - User Defined Variables
        -  Variables Defined here have global scope. Each Thread receives own copy of variable accessible by ${VAR_NAME}
        
W JMeterze istnieją 3 rodzaje zmiennych:

- properties (props) - mają zasięg globalny, zmiana w jednym miejscu jest widoczna wszędzie
- user defined variables (udv) - są procesowane na samym początku testu, każdy wątek (użytkownik) otrzymuje własną kopię zmiennej 
- variables (vars) - mają zasięg lokalny w ramach bieżącego wątka (uzytkownika)