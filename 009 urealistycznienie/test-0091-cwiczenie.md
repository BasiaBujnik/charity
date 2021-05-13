**ćwiczenie 1 (cache, embedded resource downloads)**:

W poprzednim teście mimo dodania HTTP Cache Managera i zmiany ustawień HTTP Request Defaults nie możemy zaobserwować rezultatu. Jest tak dlatego, że do tej pory nie ściągamy w teście
głównej strony naszego frontendu.

Ta jest dostępna pod adresem https://red-water-022d04b03.azurestaticapps.net/

1. Dodaj żądanie GET o stronę https://red-water-022d04b03.azurestaticapps.net/ do planu
2. Zobacz jakie zasoby są ściągane
3. Zobacz co się zmienia jesli zaznaczysz/odznaczysz opcje  w HTTP Request Defaults
4. Czy zawsze ściągamy to samo jeśli ustawisz Thread groupę na 2 iteracje i 1 użytkownika?


