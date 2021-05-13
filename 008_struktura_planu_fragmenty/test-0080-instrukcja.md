## Korzystamy z elementów konfiguracyjnych

W tej części:

Dodamy do testu:
 - setUp thread group
 - teardown thread group

Do obu wstawimy żądanie

```
GET /posts
```

aby móc porównać ile postów jest w backendzie na koniec testów względem początku testów (przecież jakieś stworzyliśmy?)

Następnie, stworzymy bibliotekę kroków, wstawimy do niej 

```
GET /posts
```

i zaktualizujemy nasz test tak, aby był łatwiejszy w utrzymaniu. 