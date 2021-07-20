## Debugowanie w�asnych test�w

GUI:

- LogLevel && Log viewer
- Listenery
- Zaznacz element -> Help -> Enable Debug


Non-GUI:

Podstawowym �r�d�em debugowania s� logi jmeter.log i jmeter-server.log. Przydatne s� szczeg�lnie w debugowaniu test�w rozproszonych i CI/CD.
Poziom logowania z linii polece� mo�na zmienia� przez paramatr (https://jmeter.apache.org/usermanual/get-started.html)  -LDEBUG np

            Invoke-Expression "$path\jmeter.bat -LDEBUG -f -n -t $testName -j logs\jmeter.log -l results\results.csv" 