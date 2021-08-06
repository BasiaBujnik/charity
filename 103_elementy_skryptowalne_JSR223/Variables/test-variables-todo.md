## ćwiczenie 

1. Stwórz od zera własny dowolny, minimalny szkielet testu, w którym używasz:
    - zmiennych UDV, które mogą być nadpisane z CLI `${__P('zmienna','wartosc domyslna')}`:
       - loops
       - users
       - rampUp
    - przynajmniej jednej funkcji `${__machineIP},...`
    - przynajmniej jednego elementu JSR223 `log.info(""),..`
2. Uruchom test z CLI dla:
    - 10 użytkowników `../jmeter.bat -Jusers=10 ...`
    - 50 użytkowników `../jmeter.bat -Jusers=50 ...`
3. Znalizuj log JMetera, czy znajduje się w nim jakaś informacja o parametrach?
    


   
        
     
    
      