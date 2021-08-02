## Przesyłanie danych testowych do Azure Log Analytics

Dane w Azure najlepiej przechowywać w taki sam jak dane telemetryczne naszej aplikacji. Najlepszym wyborem jest Azure Insights/Log Analytics.

W JMeter dane do Azure Insights można wysyłać poprzez plugin [Azure Backend Listener](https://techcommunity.microsoft.com/t5/azure-global/send-your-jmeter-test-results-to-azure-application-insights/ba-p/1195320)

W Azure Insights dane można obrabiać językiem zapytań [Kusto](https://docs.microsoft.com/en-us/azure/data-explorer/kusto/query/tutorial?pivots=azuredataexplorer)

![kusto](img/kusto.png)