## nagrywanie ruchu

1. Skonfigurujemy Chrome'a (ustawienia proxy systemowe) lub Firefoxa (ustawienia proxy wbudowane), ¿eby przekierowywa³ ruch na proxy _localhost:8888_
2. Uruchomimy nagrywarkê JMeterow¹ na porcie _8888_. Podczas uruchomienia wygeneruje siê certyfikatm który, mo¿na zaimportowaæ w przegl¹darce.
3. Zaimportujemy certyfikat w przegl¹darce z $JMETER_HOME/bin
3. Nagramy ruch do https://red-water-022d04b03.azurestaticapps.net/ z u¿yciem Test Fragment/Recording Controllera
4. Odtworzymy ruch