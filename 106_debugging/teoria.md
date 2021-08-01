## Debugowanie w�asnych test�w

![debug](img/debug.jpg)

        �r�d��: javatpoint.com

Podstawowe elementy, kt�ruch mo�esz u�y� do debugowania test�w w JMeterze to:

- Opcje 'Log Level'  && Log viewer w GUI
- Listenery r�znego rodzaju np Tree  Listener
- Selektywne debugowanie pojedynczych element�w w GUI -> Help -> Enable Debug 
- jmeter.log. jmeter-server.log je�li testy s� uruchamiane w trybie niegraficznym
- Debug PostProcesor


Non-GUI:

Poziom logowania z linii polece� mo�na zmienia� [przez parametr](https://jmeter.apache.org/usermanual/get-started.html)  -LDEBUG np:
```powershell
        Invoke-Expression "$path\jmeter.bat -LDEBUG -f -n -t $testName -j logs\jmeter.log -l results\results.csv" 
```