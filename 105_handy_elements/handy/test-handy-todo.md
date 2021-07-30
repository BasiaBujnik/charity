**æwiczenie zaawansowane - funkcja kszta³tuj¹ca obci¹¿enie**
 
Constant throughput timer zamiast sta³ej wartoœci mo¿e przyjmowaæ funkcje jako parametr np. `${__groovy(...)}`

   Zaprojektuj funkcje zwiêkszaj¹ca "throughput" o 60 req/min co 60 sekund.
   PodpowiedŸ, wykorzystaj nastepuj¹ce elementy:
   
       Funkcja - ${__groovy()}
       API, wbudowana zmienna: vars.get('TESTSTART.MS')
       Funkcja groovy: new Date().getTime()
       
   Do wizualizacji u¿yj plugina jp@gc: Transactions per second
   
   Do napisania logiki funkcji mo¿esz wykorzystaæ grroovyConsole.