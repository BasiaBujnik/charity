## Debugowanie w�asnych test�w

![groovy](img/debug.jpg)

Podstawowe elementy, kt�ruch mo�esz u�y� do debugowania test�w w JMeterze to:

- Opcje 'Log Level'  && Log viewer w GUI
- Listenery r�znego rodzaju np Tree
- Zaznacz element -> Help -> Enable Debug
- jmeter.log je�li testy s� uruchamiane w trybie niegrafivcznym


Non-GUI:

Podstawowym �r�d�em debugowania s� logi jmeter.log i jmeter-server.log. Przydatne s� szczeg�lnie w debugowaniu test�w rozproszonych i CI/CD.
Poziom logowania z linii polece� mo�na zmienia� przez paramatr (https://jmeter.apache.org/usermanual/get-started.html)  -LDEBUG np

            Invoke-Expression "$path\jmeter.bat -LDEBUG -f -n -t $testName -j logs\jmeter.log -l results\results.csv" 