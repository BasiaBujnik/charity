## Nagrywanie ruchu HTTP i jego odtwarzanie

W testach wydajno�ciowych stosujemy wzorzec "record-correlate-replay". Nagrywamy ruch, korelujemy zmienne, odgrywamy przygotowany w ten spos�b test.

![spa i mpa](img/proxy-flow.png)
        `�r�d��: www.freecodecamp.org`
        
        
JMeter posiada wbudowany element do nagrywania ruchu poprzez proxy w przegl�darce. W skr�cie nagrywanie sk�ada si� z nast�puj�cyh krok�w:
- konfiguracja przegl�darki tak, �eby ruch przechodzi� przez proxy, kt�rym jest nagrywarka JMeterowa
- symulacja sesji u�ytkownika w przegl�darce
- korelacja zmiennych w nagranym te�cie tj. access tokeny, has�a, loginy, csrf tokeny i inne warto�ci dynamiczne
- oczyszczenie i urealistycznienie skryptu

Kiedy u�ywa�:

- nie znamy aplikacji (nie budujemy jej w oparciu o np. OpenAPI)
- aplikacja jest skomplikowana lub nagrywana sesja bardzo d�uga 
- aplikacja cz�sto si� zmienia
- do debugowania
- kiedy potrafimy budowa� testy w JMeterze sami


