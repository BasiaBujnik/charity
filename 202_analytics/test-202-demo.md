## JMeter w Azure

1. W Azure Portal stwórz instancjê Application Insights i zapamiêtaj Instrumentation Key.
2. Zainstaluj plugin [Azure Backend Listner](https://techcommunity.microsoft.com/t5/azure-global/send-your-jmeter-test-results-to-azure-application-insights/ba-p/1195320) w swoim JMeterze
3. Skonfiguruj plugin aby wysy³a³ dane do Azure Insights - wykorzystaj Instrumentation Key



Dane mog¹ pojawiæ siê w AI po kilku minutach. W Application Insights w sekcji Logs wpisz
```powershell
        requests
        | limit 10
        
```

Jeœli Twoje AI wspiera Live Metrics powinieneœ widzieæ je równie¿ tam podczas testu.