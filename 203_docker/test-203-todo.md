## CICD

1. Dodaj to aktualengo testu jakiœ plugin np. Flexible File Writer
2. Uruchom test: `docker run --volume ${pwd}:/test jmeter -n -t /test/test-203-begin.jmx`. Test powinien wyrzuciæ b³¹d.
3. Przebuduj Dockerfile, ¿eby test zadzia³a³