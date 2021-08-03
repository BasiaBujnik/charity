## Docker (do demo robimy wspólnie)

- Zanalizujemy wspólnie zawartość pliku [Dockerfile](Dockerfile) i zbudujemy wykorzystując skrypt [build.ps1](build.ps1).
- Zalogujemy się do wnętrza kontenera.
- Uruchomimy test

```powershell

#execute example for powershell
docker run --rm --volume ${pwd}:/test jmeter -n -t /test/test-203-begin.jmx
#execute example for bash
docker run --rm --volume $(pwd):/test jmeter -n -t /test/test-203.jmx

```