### CI na przykladzie powershella

!Developer experience!

Na laptopie przejdz do katalogu <b>powershell</b> i wykonaj w konsoli powershell:

``. \app.ps1`` 

aby zaladowac skrypt, oraz

``Select-Winner "Legia" "Karabach Agdam"``

aby użyć funkcji ze skryptu.

Aby przetestować nasz skrypt użyj polecnia

``Invoke-Pester -Path .\app.Tests.ps1``

---

Uwaga: Wykonaj ćwiczenie na jenkinsie w folderze 003. Stworz go jeśli nie istnieje.

    
    New Item ->
        -> Wprowadź nazwę 'ci_powershell'
        -> Zaznacz 'freestyle' project
        -> Kliknij OK
            
Następnie dodajmy repozytorium, z którego skorzystamy w projekcie

    Source Code Management 
        -> Git
        -> Repository URL = https://github.com/gabrielstar/jenkins_training
        -> Build -> Add Build Step -> PowerShell
            -> Command:
                    . "$ENV:WORKSPACE\003_ci\powershell\app.ps1"
                    Select-Winner -Team1 "Legia" -Team2 "Karabach Agdam"

I skonfigurujmy częstotliwośc pytania o zmiany w repozytorium

     Build Triggers -> Poll SCM
        -> Schedule:
            * * * * *
 
 Obserwuj 'Git Polling Log'. Wykonaj zmianę? Czy coś się zmienilo? Wprowadź celowo blad i zrób 'commit'.
 
 Dla wygody komenda wyjorzystan w instrukcji znajduje się w pliku <i>003_ci/powershell/command.ps1</i>