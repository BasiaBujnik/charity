#Funkcje w JMeterze na wybranych przykładach

 - Properties vs Variables vs User Defined Variables

    User defined variables - each threads get a copy
    Variables - scope is thread only
    Properties - scope is global
        Local properties - single machine, referenced by -JpropertyName
        Global properties - single machine and remotes, refereneced by -GpropertyName
        
 - Funkcje
 
 Bezpośrednio w elementach JMetera możemy też wykorzystywać funkcje
 
   ${__Funkcja(param1\,param2)}
   
 Najczęściej wykorzystywane funkcje
 
    ${__groovy(vars.get("myVar").substring(0\,2))} 