Eskstraktory są dobrym przykładem aplikacji elementu JMeterowego do odpowiedzi w celu przetworzenia jej w zaawansowany sposób.
Często niepraktyczne jest uruchamianie całego testu po to tylko, żeby móc pracować na odpowiedzi z serwera.

Podejściem, które ułatwi nam pracę nad takimi elementami jest mockowanie. Skorzystamy z następujących elementów:

- setUp thread groupa
- dummy sampler (zewnętrzny plugin)
- opcja Validate

aby usprawnić sobie pracę z ekstraktorami. Mocki te w pewnym sensie będzie można też traktować jako testy bardziej zaawansowanych logik.



 