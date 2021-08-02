## Docker (do demo robimy wsp�lnie)

- Zanalizujemy wsp�lnie zawarto�c pliku [Dockerfile](Dockerfile) i zbudujmey wykorzystuj�c skrypt [build.ps1](build.ps1).
- Zalogujemy si� do wn�trza kontenera.
- Uruchomimy test

```powershell

#execute example for powershell
docker run --volume ${pwd}:/test jmeter -n -t /test/test-203-begin.jmx
#execute example for bash
docker run --volume $(pwd):/test jmeter -n -t /test/test-203.jmx

```