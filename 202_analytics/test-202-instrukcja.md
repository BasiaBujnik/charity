## JMeter w Azure

1. W Azure Portal stw�rz instancj� Application Insights i zapami�taj Instrumentation Key.
2. Zainstaluj plugin Azure Backend Listner w swoim JMeterze
3. Skonfiguruj plugin aby wysy�a� dane do Azure Insights

https://techcommunity.microsoft.com/t5/azure-global/send-your-jmeter-test-results-to-azure-application-insights/ba-p/1195320

Dane mog� pojawi� si� w AI po kilku minutach. W Application Insights w sekcji Logs wpisz

    requests
    | limit 10
    
Je�li Twoje AI wspiera Live Metrics powiniene� widie� je r�wnie� tam.