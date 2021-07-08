### Wprowadzenie do narzędzi do budowania aplikacji na przykladzie mavena 

### Czym jest maven ?
https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html

Aby zobrazować czym jest maven przejdź do katalogu 003_ci/maven/project w repozytorium i wykonaj

PWSH (pamiętaj o ` przed -)

    mvn archetype:generate `-DgroupId=com.mycompany.app `-DartifactId=my-app `-DarchetypeArtifactId=maven-archetype-quickstart `-`DarchetypeVersion=1.4 `-DinteractiveMode=false
    cd my-app
    mvn install
    java `-cp target/my-app-1.0-SNAPSHOT.jar com.mycompany.app.App  
    
Zanalizuj zawartość folderu.

-----------------------------------------

Przejdź do folderu my-app i wykonaj niektóre z faz mavena:

`` mvn compile``

`` mvn test``

`` mvn install``

Aby latwiej pracować z projektem mavenowym, w IntelliJ kliknij prawym przyciskiem na pom.xml i wybierze Add as Maven Project. Zmień widok na Project.
Wykonaj testy klikając prawym przyciskiem na klasę testów AppTest a następnie -> Run.

---

#### Jenkins i maven

(Opcjonalnie)
Aby stworzyć dynamicznie projekt mavenowy, wykonać testy i pozostale fazy mavena a na końcu uruchomić aplikację stwórzmy projekt typu freestyle.

    
    New Item ->
        -> Wprowadź nazwę 'ci_maven'
        -> Zaznacz 'freestyle' project
        -> Kliknij OK
        
Następnie dodajmy skrypt powershellowy tworzacy projekt, wykonujacy ``mvn install`` i uruchamiajacy aplikacje. 

         Build Triggers -> Build Periodically 
            -> Schedule:
                * * * * *
         Build -> Add Build Step -> PowerShell
            -> Command:
                    mvn archetype:generate `-DgroupId=com.mycompany.app `-DartifactId=my-app `-DarchetypeArtifactId=maven-archetype-quickstart `-`DarchetypeVersion=1.4 `-DinteractiveMode=false
                    cd my-app
                    mvn install
                    java `-cp target/my-app-1.0-SNAPSHOT.jar com.mycompany.app.App
             -> Save
 
 Następnie uruchom Builda.  
 Dla wygody komenda powershellowa znajduje się w pliku command.ps1 w bieżącym folderze.
 
 
