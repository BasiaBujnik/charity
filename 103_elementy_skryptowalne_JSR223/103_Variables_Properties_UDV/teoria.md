#Funkcje, Zmiennie i Parametry

W JMeterze występują następujące elementy "programistyczne", które można stsosować w większości miejsc:

   - User defined variables (UDV), zmienne użytkownika - każdy wątek otrzymuje kopię tej zmiennej, są one ewaluowane na początku planu niezależnie od miejsca występowania
   - Variables - zmienne, zmienne mają zasięg lokalny (w obrębie wątka)
   - Properties - właściwości, mają zasięg globalny, są wspólne dla wszytskich wątków
        - Local properties - związane są z maszyną lokalną, odwołanie przez -JpropertyName
        - Global properties - wykorzystuje się w testowaniu rozproszonym, obejmują rówznież elementy zdalne testu, refereneced by -GpropertyName
        
 - Funkcje https://jmeter.apache.org/usermanual/functions.html#__evalVar
 
 JMeter udostępnia również funkcje, które rozwiązują najczęstsze problemy pojawiające się w testach bez konieczności programowania własnej logiki w np. Groovy
  
---

Jak odwołujemy się do tych elementów:

Zmienne (Variables):
    
    W elementach UI: ${var}
    W elementach skryptowalnych:    vars.get('var')
                                    vars.put('var','value') 
Funkcja:

    ${__functionName(var1,var2,var3)} //3 parametry
    ${__functionName(var1part1\,var1part2,var3)} // 2 parametry "var1part1,var1part2" i var3, znak "," musi być poprzedzony \
    ${__functionName} //no parameter function

Właściwości (Properties):

    W elementach UI: ${__P('prop','defaultValue')}
    W elementach skryptowalnych:    props.get('var')
                                    props.put('var','value') 
        
           
 Najczęściej wykorzystywane funkcje
 
            ${__threadNum}
            ${__machineName}
            ${__machineIP}
            ${__UUID()}
            ${__P(group1.threads)
            ${__groovy(vars.get("myVar").substring(0\,2))} //wykonuje kod groovy
            ${__V(A${N})}
 
 W JMeter GUI istnieje function helper dialog, którego można użyć, żeby wygenerować działający kod snippet.
 Trener pokaże przykładowy plik .jmx obrazujący powyższe kwestie.