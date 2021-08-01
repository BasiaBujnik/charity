## Debugowanie w³asnych testów

![groovy](img/debug.jpg)

Podstawowe elementy, któruch mo¿esz u¿yæ do debugowania testów w JMeterze to:

- Opcje 'Log Level'  && Log viewer w GUI
- Listenery róznego rodzaju np Tree
- Zaznacz element -> Help -> Enable Debug
- jmeter.log jeœli testy s¹ uruchamiane w trybie niegrafivcznym


Non-GUI:

Podstawowym Ÿród³em debugowania s¹ logi jmeter.log i jmeter-server.log. Przydatne s¹ szczególnie w debugowaniu testów rozproszonych i CI/CD.
Poziom logowania z linii poleceñ mo¿na zmieniaæ przez paramatr (https://jmeter.apache.org/usermanual/get-started.html)  -LDEBUG np

            Invoke-Expression "$path\jmeter.bat -LDEBUG -f -n -t $testName -j logs\jmeter.log -l results\results.csv" 