**ćwiczenie 1 (cache, embedded resource downloads)**:

W poprzednim teście mimo dodania HTTP Cache Managera i zmiany ustawień HTTP Request Defaults nie możemy zaobserwować żadnej zmiany. Jest tak dlatego, że do tej pory nie ściągamy w teście
głównej strony naszego frontendu, która może jako zasób statyczny być cache'owana, podobnie jak zawarte w niej zasoby statyczne: obrazki, skrypty etc.

Ta jest dostępna pod adresem https://red-water-022d04b03.azurestaticapps.net/

1. Dodaj żądanie GET o stronę https://red-water-022d04b03.azurestaticapps.net/ do planu jak pierwsze żądanie w naszej transakcji User Journey
2. Zobacz jakie zasoby są ściągane w pierwszej i kolejnych iteracjach
3. Zobacz co się zmienia jesli zaznaczysz/odznaczysz opcje  w HTTP Request Defaults
4. Czy zawsze ściągamy to samo jeśli ustawisz Thread groupę na 2 iteracje lub więcej (loops) i 1 użytkownika (threads)?

**ćwiczenie 2 (cache debugging)**

1. Zaznacz w drzewie testu HTTP Cache Manager i kliknij Help->Enable Debug aby włączyć debugowanie tego elementu
2. Wyłącz wszystkie żądania (disable) oprócz tego o stronę główną i puść test
3. Zanalizuj log, co się dzieje?
4. Zaznacz z HTTP Cache Manage - Clear Cache each iteration i powtórz test


