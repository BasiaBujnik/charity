## nagrywanie ruchu

1. Skonfigurujemy Chrome'a (ustawienia proxy systemowe) lub Firefoxa (ustawienia proxy wbudowane), �eby przekierowywa� ruch na proxy _localhost:8888_
2. Uruchomimy nagrywark� JMeterow� na porcie _8888_. Podczas uruchomienia wygeneruje si� certyfikatm kt�ry, mo�na zaimportowa� w przegl�darce.
3. Zaimportujemy certyfikat w przegl�darce z $JMETER_HOME/bin
3. Nagramy ruch do https://red-water-022d04b03.azurestaticapps.net/ z u�yciem Test Fragment/Recording Controllera
4. Odtworzymy ruch