## CICD

1. Dodaj to aktualengo testu jaki� plugin np. Flexible File Writer
2. Uruchom test: `docker run --volume ${pwd}:/test jmeter -n -t /test/test-203-begin.jmx`. Test powinien wyrzuci� b��d.
3. Przebuduj Dockerfile, �eby test zadzia�a�