## Korzystamy z elementów konfiguracyjnych

W tej części:

Użyjemy **User Defined Variables** (Zmiennych użytkownika) aby sparametryzować nasz plan:
 - apiURL
 - protocol    
2. Dodamy element **HTTP Request Defaults** aby zredukować powtórzenia i sprawić by test był łatwiejszy w utrzymaniu
3. Nauczymy się używać zmiennych poprzez _${ZMIENNA}_ w róznych miejscach w teście
4. Dodamy nagłówek do żądania /todos z podstawową autentykacja (Basic Auth):
    - https://www.debugbear.com/basic-auth-header-generator