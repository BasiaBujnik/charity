##Kolejnośc wykonywania elementów w JMeterze

Elementy JMetera wykonują się w zalożności od położenia (hierarchii) i porządku.

Podstawowy schemat wygląda tak:

**Test Plan** - przestrzeń robocza, pod którą podpinamy wszystkie elementy naszego planu:
- **Thread Group** -  grupa wątków, którą utożsamiamy z sesjami bądź wirtaulanymi użytkownikami:
    - **Config Elements** - elementy konfiguracyjne kontrolujące rózne opcje planu np. HTTP Cache Manager
    - **Pre-processors** - pozwalają zmodyfikować żądanie zanim je wyślemy
    - **Timer** - dzięki timerom możemy opóźniać akcje użytkownika 
    - **Logic Controller/Sampler**
        - Logic Controller - kontrolują logikę/wykonanoe naszego testu np. if, for, while, ...
        - Sampler -  sampler faktycznie coś robi, symuluje akcje użytkownika, np. HTTP request, JDBC request, ...,
     - **Post-processors** - wykonują się po akcji użytkownika i moga pracować na rezultacie tej akcji
     - **Assertions**
     - **Listener** - elementy pozwalające wizualizować wyniki/bądź wysyłać/obrabiać je w konkretny sposób

Kolejność wykonywania elementów w JMeterze będzie zgodna z tym schematem nawet jeśli w samym teście nie trzymamy się porządku.

[Zakres i kolejność wykonywania elementw w JMeterze](https://jmeter.apache.org/usermanual/test_plan.html)
Aby upewnić się do zakresu danego elementu korzystamy z pomocy.