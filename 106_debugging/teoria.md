## Debugowanie w³asnych testów

![debug](img/debug.jpg)

        Ÿród³ó: javatpoint.com

Podstawowe elementy, któruch mo¿esz u¿yæ do debugowania testów w JMeterze to:

- Opcje 'Log Level'  && Log viewer w GUI
- Listenery róznego rodzaju np Tree  Listener
- Selektywne debugowanie pojedynczych elementów w GUI -> Help -> Enable Debug 
- jmeter.log. jmeter-server.log jeœli testy s¹ uruchamiane w trybie niegraficznym
- Debugging PostProcesor (pozwala na wyœwietlenie w³asæiwoœci samplera) i Debug Sampler


Non-GUI:

Poziom logowania z linii poleceñ mo¿na zmieniaæ [przez parametr](https://jmeter.apache.org/usermanual/get-started.html)  -LDEBUG np:
```powershell
        Invoke-Expression "$JMETER_HOME\jmeter.bat -LDEBUG -f -n -t test.jmx -j logs\jmeter.log -l results\results.csv" 
```