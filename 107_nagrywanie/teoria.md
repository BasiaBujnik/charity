## Nagrywanie ruchu HTTP i jego odtwarzanie

W testach wydajnościowych stosujemy wzorzec "record-correlate-replay". Nagrywamy ruch, korelujemy zmienne, odgrywamy przygotowany w ten sposób test.

![spa i mpa](img/proxy-flow.png)
        `żródłó: www.freecodecamp.org`
        
        
JMeter posiada wbudowany element do nagrywania ruchu poprzez proxy w przeglądarce. W skrócie nagrywanie składa się z następującyh kroków:
- konfiguracja przeglądarki tak, żeby ruch przechodził przez proxy, którym jest nagrywarka JMeterowa
- import certyfikatu proxy JMeterowego do przeglądarki (proxy działa jak MITM i ma własny certyfikat, który trzeba zaakceptować,żeby połączenie SSL było uznane za bezpieczne)
- symulacja sesji użytkownika w przeglądarce
- korelacja zmiennych w nagranym teście tj. access tokeny, hasła, loginy, csrf tokeny i inne wartości dynamiczne
- oczyszczenie i urealistycznienie skryptu

Kiedy używać:

- nie znamy aplikacji (nie budujemy jej w oparciu o np. OpenAPI)
- aplikacja jest skomplikowana lub nagrywana sesja bardzo długa 
- aplikacja często się zmienia
- do debugowania
- kiedy potrafimy budować testy w JMeterze sami
- kiedy chcemy skorzystać z podstawowej korelacji zmiennych


