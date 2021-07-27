## Ekstraktory

W testach często zachodzi potrzeba wyekstrahowania jakiejś wartości z odpowiedzi HTTP, ciała tej odpowiedzi lub nagłówka, i użycie tej wartości w dalszej części testów.
Do ekstrakcji używamy Ekstraktórów, których w JMeterze jest kilka rodzajów:

- CSS - do parsowania dokumentów HTML : https://www.w3schools.com/cssref/css_selectors.asp
- XPath2.0 - do parsowania dokumentów XML: https://www.w3schools.com/xml/xpath_syntax.asp (XPath nie jest już rekomendowany)
- JSONPath - do parsowania JSON: https://support.smartbear.com/alertsite/docs/monitors/api/endpoint/jsonpath.html
- JMESPath - do parsowania JSON, https://jmespath.org/ https://jmespath.org/tutorial.html
- Boundary Extractor - dowolny łańcuch znaków
- Regular Expression Extractor - dowolny łańcuch znaków

Najczęściej ekstrahowane elementy to:
 
 - wersja aplikacji
 - tokeny CSRF
 - tokeny dostępowe
 
Pamiętaj:
- Do HTMLa - CSS
- Do XMLa - XPATH 2.0 (szybszy, więceh funckjonalności ale wymaga dobrego HTMLa)
- Do JSONa - JMSE
- Regex kosztuje
- Używaj domyślnych wartości