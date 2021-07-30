## ćwiczenie (mniej zaawansowani mogą załadować plik z odpowiedzią i go zanalizować)

1. Uruchom test-variables-demo_result.ps1 i sprawdź logu czy jest informacja o nadpisaniu wartości property 'url' z linii poleceń
2. Stwórz od zera własny dowolny, minimalny szkielet testu, w którym używasz:

    - Przynajmniej 1 funkcji w wlemencie UI
    - User Defined Variables, których wartośc możesz zmienić z zewnątrz przez parametry np. loops, threads:
    - User Defined Variables, który ustawia nowe UDV jako konkatenacje zmiennych z poprzedniego elementu 
    - Elementu skryptowalnego JSR223/Groovy, w którym wyświetlasz numer wątka i pętli. Podpowiedź, użyj:
 
 3. Przerób plik test-variables-demo_result.jmx tak aby url był czytany bezpośrednio z property a nie ze zmiennej.
        
        W samplerze JSR223 dodaj linijkę:
            props.put('url','wartosc')
        Zamień w odpowiednich miejscach w UI/HTTP Samplerze 
            ${url}
        na
            ${__P(url)}            
        i aby w pre procesorze 
            vars.put('url','wartosc')
        zamienic na
            props.put('url','wartosc')
   
        
     
    
      