##Powershell

Powershell jest językiem skryptowym dla platformy Windows, natomiast najnowszy Powershele (core) jest cross-platformowy i działa również na linuksie.

https://learnxinyminutes.com/docs/powershell/


**Cwiczenie**

Na laptopie przejdz do katalogu <b>powershell</b> i wykonaj w konsoli powershell:

```powershell
. \app.ps1
``` 

aby zaladowac skrypt, oraz

```powershell
Select-Winner "Legia" "Karabach Agdam"
```

aby użyć funkcji ze skryptu.

Aby uruchomić unti testy dla skryptu użyj polecnia

```powershell
Invoke-Pester -Path .\app.Tests.ps1
```
---
