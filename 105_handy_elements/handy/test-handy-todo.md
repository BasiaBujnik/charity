**�wiczenie zaawansowane - funkcja kszta�tuj�ca obci��enie**
 
Constant throughput timer mo�e zawiera� funkcje np. ${__groovy(...)}

   Zaprojektuj funkcje zwi�kszaj�ca "throughput" o 60 req/min co 60 sekund.
   Podpowied�, wykorzystaj elementy:
   
       Funkcja - ${__groovy()}
       API, wbudowana zmienna: vars.get('TESTSTART.MS')
       funkcja groovy: new Date().getTime()
       
   Do wizualizacji u�yj plugina jp@gc: Transactions per second
   Do napisania logiki funckji mo�esz wykorzysta� grroovyConsole.