## Docker


1. Uruchom test: `docker run --rm --volume ${pwd}:/test jmeter -n -t /test/test-203-begin.jmx`. Opcjonalnie zapisz log do wolumenu /test `-j /test/jmeterdockerlog.log` i zweryfikuj czy log pojawił się również na dysku hosta.

2. Dodaj to aktualnego testu jakiś plugin np. Flexible File Writer. Puśc test, powinien rzucić błąd. Przebuduj Dockerfile, żeby test zadziałał