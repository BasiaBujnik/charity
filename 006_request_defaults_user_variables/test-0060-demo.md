## Korzystamy z podstawowych elementów konfiguracyjnych

W tej części:

1. Użyjemy **User Defined Variables** (Zmiennych użytkownika) aby sparametryzować nasz plan:
     - apiURL
     - protocol    
2. Nauczymy się używać zmiennych poprzez _${ZMIENNA}_ w róznych miejscach w teście
3. Dodamy element **HTTP Request Defaults** aby zredukować powtórzenia i sprawić by test był łatwiejszy w utrzymaniu
4. Dodamy  do żądania nagłówek poprzez element **HTTP Request Defaults** tak aby
 
    ```powershell
       GET /todos
       Authorization: Basic ...
    ```
       
     
     działalo z podstawową autentykacja (Basic Auth - https://www.debugbear.com/basic-auth-header-generator)