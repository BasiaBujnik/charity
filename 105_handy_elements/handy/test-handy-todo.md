**æwiczenie zaawansowane - funkcja kszta³tuj¹ca obci¹¿enie**
 
Constant throughput timer mo¿e zawieraæ funkcje np. ${__groovy(...)}

   Zaprojektuj funkcje zwiêkszaj¹ca "throughput" o 60 req/min co 60 sekund.
   PodpowiedŸ, wykorzystaj elementy:
   
       Funkcja - ${__groovy()}
       API, wbudowana zmienna: vars.get('TESTSTART.MS')
       funkcja groovy: new Date().getTime()
       
   Do wizualizacji u¿yj plugina jp@gc: Transactions per second
   Do napisania logiki funckji mo¿esz wykorzystaæ grroovyConsole.