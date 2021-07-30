## Funkcje, Zmienne i Parametry

![groovy](../img/jmeter.png)

W JMeterze występują następujące elementy pozwalające na komunikację, przekazywanie wartości w obrębie test planu:

   - **User defined variables** (UDV), zmienne użytkownika - każdy wątek otrzymuje kopię tej zmiennej, są one ewaluowane na początku planu niezależnie od miejsca występowania
   - **Variables** - zmienne, zmienne mają zasięg lokalny (w obrębie wątka)
   - **Properties** - właściwości, mają zasięg globalny, są wspólne dla wszystkich wątków
        - Local properties - związane są z maszyną lokalną, odwołanie z linii poleceń przez -JpropertyName
        - Global properties - wykorzystuje się w testowaniu rozproszonym, obejmują również elementy zdalne testu, odwołanie z linii poleceń przez -GpropertyName     

Dodatkowo JMeter oferuje API, z którego może korzystać programista testów, w postaci:   
   
   - **Functions** - wbudowane funkcje https://jmeter.apache.org/usermanual/functions.html#__evalVar
   - **Obiekty API** - pozwalają na dostęp do kontekstu JMetera z elementów JSR223
 
 Funkcje rozwiązują najczęstsze problemy pojawiające się w testach bez konieczności programowania własnej logiki w np. Groovy
  
***

Jak odwołujemy się do tych elementów ?:

**Funkcje**:

    ${__functionName(var1,var2,var3)} //3 parametry
    ${__functionName} //funkcja bez parametru
    ${__functionName(var1part1\,var1part2,var3)} // 2 parametry "var1part1,var1part2" i var3, znak "," musi być poprzedzony \

    Najczęściej wykorzystywane funkcje to:
 
            ${__threadNum}
            ${__machineName}
            ${__machineIP}
            ${__UUID()}
            ${__Random(0,10)}
            ${__P(wlasciwosc)}
            ${__groovy(vars.get("myVar").substring(0\,2))} //wykonuje kod groovy
 
 > W JMeter GUI istnieje "function helper dialog", którego można użyć, żeby wygenerować działający kod funkcji.
 
 
**Zmienne** (Variables):
    
    W elementach UI: ${var}
    W elementach skryptowalnych (przez API): vars.get('var')
                                             vars.put('var','value') 
**Właściwości** (Properties):

    W elementach UI: ${__P('prop','defaultValue')}
    W elementach skryptowalnych (przez API):    props.get('var')
                                                props.put('var','value') 
        
Właściwości mogą być też zaczytywane z plików .properties. Pliki te znajdują sie w JMETER_HOME i pozwalają na nadpisywanie ustawień JMetera:

- _system.properties_ - ustawienia systemowe
- _reportgenerator.properties_ - ustawienia raportów
- _jmeter.properties_ - ustawienia JMetera
- _user.properties_ - ustawienia użytkownika

Ustawienia z pliku user.properties nadpisują wcześniej parsowane pliki. Dobrą praktyką jest dokonywanie zmian tylko w plikach user.properties.
    
**Obiekty API**:

Dodatkowo w elementach skryptowalnych mamy dostęp do publicznego [API Jmetera](https://www.blazemeter.com/blog/top-8-jmeter-java-classes-you-should-be-using-with-groovy).
Jest to kilka obiektów, z których możemy korzystać w trakcie testów np. log, ctx, vars, props, ...:

        log.info("komunikat")
        vars.get('nazwa')
        vars.put('nazwa','wartosc')
        props.get('nazwa','wartosc')
        props.put('nazwa','wartosc')
        prev.isSuccessful()
        ctx.getThreadNum()
        
Trener pokaże przykładowy plik .jmx obrazujący powyższe kwestie.