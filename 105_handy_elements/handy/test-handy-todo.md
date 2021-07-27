**æwiczenie zaawansowane - funkcja kszta³tuj¹ca obci¹¿enie**
 
Constant throughput timer mo¿e zawieraæ funkcje np. ${__groovy(...)}

   Zaprojektuj funkcje zwiêkszaj¹ca "throughput" o 60 req/min co 10 sekund.
   PodpowiedŸ, wykorzystaj elementy:
   
       Funkcja - ${__groovy()}
       API: vars.get('TESTSTART.MS')
       API: new Date().getTime()