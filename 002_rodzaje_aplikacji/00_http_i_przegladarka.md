#Jak działa HTTP i co robi przeglądarka? 
***
## HTTP 

Protokołem komunikacyjnym aplikacji webowych jest HTTP. Opisuje on jaką akcję chcemy wykonać względem określonego zasobu (na serwerze).

![warstwy](img/simple-client-server.png)

    `żrodło: https://developer.mozilla.org/en-US/docs/Learn/Getting_started_with_the_web/How_the_Web_works`

Jest to protokół oparty na schemacie Żądanie-Odpowiedź. Nie ma odpowiedzi bez żądania. Serwer nie może wysłać wiadomości pierwszy (dlatego powstają takie technologie jak WebSockets).

Metody HTTP:    
- GET - pobranie reprezentacji zasobu
- HEAD - to samo co GET ale bez zawartości
- POST - stworzenie zasobu
- PUT - zamiana zasobu
- PATCH - częściowa modyfikacja zasobu
- DELETE - usunięcie zasobu
- OPTIONS - zapytanie o opcje komunikacji dla zasobu
- TRACE - test komunikacji do zasobu
- CONNECT - ustanowienie tunelu do zasobu (np. w web socketach, HTTPS)

``żródło: https://developer.mozilla.org/en-US/docs/Web/HTTP/Methods``


Resources:
- HTML
- CSS
- JavaScript
- Media

```powershell
    Invoke-WebRequest
```
```console
    curl -X GET http://bing.com
```

## Co robi przeglądarka
***

![warstwy](img/browser.png)

    `żródło: https://www.youtube.com/watch?v=oZkfApkWgPc&t=369s`