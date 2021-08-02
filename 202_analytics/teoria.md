## Przesyłanie danych testowych do Azure Log Analytics

Dane w Azure najlepiej przechowywać w taki sam jak dane telemetryczne naszej aplikacji. Najlepszym wyborem jest Azure Insights/Log Analytics.

W JMeter dane do Azure Insights można wysyłać poprzez plugin [Azure Backend Listener](https://techcommunity.microsoft.com/t5/azure-global/send-your-jmeter-test-results-to-azure-application-insights/ba-p/1195320)

W Azure Insights dane można obrabiać językiem zapytań [Kusto](https://docs.microsoft.com/en-us/azure/data-explorer/kusto/query/tutorial?pivots=azuredataexplorer)

![kusto](img/kusto.png)

Przykłady zapytań w kusto:

```powershell
#wyświetla dane z tabeli o nazwie 'requests'
requests;

#wyświetla wybrane kolumny
requests | project url,duration;

#przypisanie wyniku filtracji do zmiennej
let data = requests | project url, duration, customDimensions;
data;

#rozszerzenie tabeli o nowe kolumeny
let newdata = data | extend bytesSent=customDimensions.SentBytes;
newdata;

#wykresy
newdata | render piechart;

```

Język ten może być użyty do tworzenia wykresów i dashboardów - skutecznie zastępując tradycyjny raport HTMLowy.