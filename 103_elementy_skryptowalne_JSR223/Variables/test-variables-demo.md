## Instrukcja - zmienne, właściwości, funkcje, API

W tej części

- Stworzymy prosty plan 
            
            Test Plan 
                 setUp ThreadGroup
                 ThreadGroup
                 tearDown ThreadGroup
                 
- W setUp ThreadGroup:
    - Dodamy element UDV i pokażemy jak wyliczać UDV na podstawie UDV
    
                    Test Plan 
                         setUp ThreadGroup
                            User Defined Variables
                            User Defined Variables Calculated
                         ThreadGroup
                         tearDown ThreadGroup
                         
    - Pokażemy jak przekazywać parametry z zewnątrz z użyciem funkcji __P i nadpisywać te wartości w pliku user.properties
                    
                    url	| ${__P(url,onet.pl)}	//tak procesujemy  parametry z linii poleceń w elemencie UDV
                    (..)/jmeter.bat -Jurl=sport.onet.pl //a tak je podajemy z linii poleceń
                    url=pogoda.onet.pl //a taki wpis musi być w pliku user.propeties jeśli chcemy użyć pliku properties to ustawienia wartości propetty
                    
    - Dodamy JSR223 Sampler i zobaczymy jak można ustawiać property w kodzie przez metody API i jak wywoływać funkcje
    
                        Test Plan 
                             setUp ThreadGroup
                                User Defined Variables
                                User Defined Variables Computed
                                Set properties ${__UUID}
                             ThreadGroup
                             tearDown ThreadGroup
                             
- W tearDown threadGroup pokażemy jak czyścić property i dlaczego to robić
                
                props.clear()
                
                
***
                
- Następnie:
    - Wyświetlimy  własćiwości z "Property Display" i "Debug Samplerem"
    - Pokażemy przykład wykorzystania JSR223 preprocesora do zmiany zmiennej i, że zmiana ta będzie lokalna dla wątku.
    

