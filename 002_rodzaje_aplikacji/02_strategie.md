#Analiza wymagań niefunkcjonalnych, dobór właściwej strategii testowania, najczęściej spotykane przypadki
***
## Wymagania niefunkcjonalne
***

Dobre:

>Wymaganie1: 95% czasów odpowiedzi API < 4s
>
>Wymaganie2: Maksymalna oczekiwana liczba użytkowników na minutę to 180. Akceptowalna liczba błędów to 0.0001 %
>

Złe:

>Wymaganie1: Aplikacja ma odpowiadać na każde żądanie < 4s
>


## Strategie/podejścia

## record-correlate-replay

1. Używamy prawdziwej aplikacji.
2. Symulujemy użytkownika (przechodząc scenariusz w przeglądarce, z wykorzystaniem Selenium lub np. Cypress)
3. Nagrywamy ruch bezpośrednio lub pośrednio (.har - HTTP Archive Format)
4. Korelujemy żądania w narzędziu.
5. Odgrywamy ruch

(to jest podejście, które będziemy dziś omawiać)

## build-up

Budujemy ruch od zera bez nagrywania na podstawie np. Swagger UI

##goal oriented

Bazujemy na danych z produkcji. Na przykład wiemy, że konkretna transkacja jest bardzo wolna. Testujemy tylko ją przed poprawkami i po poprawkach.
Podejście selektywne i nastawione na konkretny efekt.

***

##Co potrzebujemy?

    - Wiedza teoretyczna
    - Kontekst (przedmiot testów, strategia, ...)
    - Narzędzie - rzemiosło
   