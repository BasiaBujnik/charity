## Debugowanie w³asnych testów

GUI:

- LogLevel && Log viewer
- Listenery
- Zaznacz element -> Help -> Enable Debug


Non-GUI:

Podstawowym Ÿród³em debugowania s¹ logi jmeter.log i jmeter-server.log. Przydatne s¹ szczególnie w debugowaniu testów rozproszonych i CI/CD.
Poziom logowania z linii poleceñ mo¿na zmieniaæ przez paramatr (https://jmeter.apache.org/usermanual/get-started.html)  -LDEBUG np

            Invoke-Expression "$path\jmeter.bat -LDEBUG -f -n -t $testName -j logs\jmeter.log -l results\results.csv" 