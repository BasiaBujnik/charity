## Struktura planu i trio: Test Fragment, Module Controller, Simple Controller


## struktura planu

Mimo, że często w testach JMeterowych mamy do czynienia tylko z Thread Group'ą, pełna struktura planu jest podobna do tej znanej nam z testów jednostkowych:

- setUp - zawsze wykonuje się na początku, używamy do inicjalizacji testów
- threadGroup(s) - 1 lub więcej, równolegle lub szeregowo
- tearDown - zawsze wykonuje się na końcu, używamy do zamykania otwartych zasobów, finalizacji


## reużywalność elementów JMeterowych - trio

Trio (Test Fragment - Simple Controller - Module Controller):
```
TEST:

Module Controller/
    ...

BIBLIOTEKA:

Test Fragement/
    /Simple controller
       /Reusable element
        ...
```

Użycie całej trójki pozwala nam zwiększyć utrzymywalność testów jeszcze bardziej poprzez re-używanie tej samej transakcji w wielu miejscach w planie.