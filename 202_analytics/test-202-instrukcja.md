## JMeter w Azure

1. W Azure Portal stwórz instancjê Application Insights i zapamiêtaj Instrumentation Key.
2. Zainstaluj plugin Azure Backend Listner w swoim JMeterze
3. Skonfiguruj plugin aby wysy³a³ dane do Azure Insights

https://techcommunity.microsoft.com/t5/azure-global/send-your-jmeter-test-results-to-azure-application-insights/ba-p/1195320

Dane mog¹ pojawiæ siê w AI po kilku minutach. W Application Insights w sekcji Logs wpisz

    requests
    | limit 10
    
Jeœli Twoje AI wspiera Live Metrics powinieneœ widieæ je równie¿ tam.