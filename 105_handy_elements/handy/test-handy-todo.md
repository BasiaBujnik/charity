**�wiczenie zaawansowane - funkcja kszta�tuj�ca obci��enie**
 
Constant throughput timer zamiast sta�ej warto�ci mo�e przyjmowa� funkcje jako parametr np. `${__groovy(...)}`

   Zaprojektuj funkcje zwi�kszaj�ca "throughput" o 60 req/min co 60 sekund.
   Podpowied�, wykorzystaj nastepuj�ce elementy:
   
       Funkcja - ${__groovy()}
       API, wbudowana zmienna: vars.get('TESTSTART.MS')
       Funkcja groovy: new Date().getTime()
       
   Do wizualizacji u�yj plugina jp@gc: Transactions per second
   
   Do napisania logiki funkcji mo�esz wykorzysta� grroovyConsole.