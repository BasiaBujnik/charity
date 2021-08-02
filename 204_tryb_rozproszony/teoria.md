## Tryb rozproszony

[Tryb rozproszony](https://jmeter.apache.org/usermanual/jmeter_distributed_testing_step_by_step.html) stosujemy wtedy gdy 1 maszyna 
nie wystarcza nam do wygenerowania założonego obciążenia .

W tym trybie mamy 2 rodzaj kontrolerów:
- worker (wykonuje test)
- master (koordynuje test na workerach)

![architecture](img/distributed-jmeter.svg)
![terminology](img/distributed-names.svg)


            żródło: https://jmeter.apache.org/usermanual/jmeter_distributed_testing_step_by_step.html



Jak uruchomić testy w tym trybie na własnej maszynie?

1. Idź do katalogu `${JMETER_HOME}/bin` i wystartuj `jmeter-server.bat`
2. Wyedytuj plik [teoria.ps1](teoria.ps1), przeanalizuj, i uruchom (controller).

