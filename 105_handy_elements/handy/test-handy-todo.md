**�wiczenie zaawansowane - funkcja kszta�tuj�ca obci��enie**
 
Constant throughput timer mo�e zawiera� funkcje np. ${__groovy(...)}

   Zaprojektuj funkcje zwi�kszaj�ca "throughput" o 60 req/min co 10 sekund.
   Podpowied�, wykorzystaj elementy:
   
       Funkcja - ${__groovy()}
       API: vars.get('TESTSTART.MS')
       API: new Date().getTime()