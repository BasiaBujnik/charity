## JMeter w Azure

1. W Azure Portal stwórz instancję Application Insights i zapamiętaj Instrumentation Key.
2. Zainstaluj plugin [Azure Backend Listner](https://techcommunity.microsoft.com/t5/azure-global/send-your-jmeter-test-results-to-azure-application-insights/ba-p/1195320) w swoim JMeterze
3. Skonfiguruj plugin aby wysyłał dane do Azure Insights - wykorzystaj Instrumentation Key



Dane mogą pojawić się w AI po kilku minutach. W Application Insights w sekcji Logs wpisz
```powershell
        requests
        | limit 10
        
```

Jeśli Twoje AI wspiera Live Metrics powinieneś widzieć je również tam podczas testu.