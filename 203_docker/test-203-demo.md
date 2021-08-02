## Docker (do demo robimy wspólnie)

- Zanalizujemy wspólnie zawartoœc pliku [Dockerfile](Dockerfile) i zbudujmey wykorzystuj¹c skrypt [build.ps1](build.ps1).
- Zalogujemy siê do wnêtrza kontenera.
- Uruchomimy test

```powershell

#execute example for powershell
docker run --volume ${pwd}:/test jmeter -n -t /test/test-203-begin.jmx
#execute example for bash
docker run --volume $(pwd):/test jmeter -n -t /test/test-203.jmx

```