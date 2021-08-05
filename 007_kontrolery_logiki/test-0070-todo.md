**ćwiczenie 1 (preflight)**:

Pod kontrolerem **IF** a przed żądaniem ``POST /post/add/new`` dodaj   ``OPTIONS /post/add/new`` aby zasymulować pre-flight z przeglądarki.
 
**ćwiczenie 2**:

Pod kontrolerem If dodaj kontroler LOOP tak aby w każdej iteracji tworzyły się 2 posty.


**ćwiczenie 3**:

Zasymuluj dłuższy test wydajnościowy obciążający naszą aplikację. Spraw by trwał 1-2 minuty, tempo przyrostu użytkowników było 1uż./s. Zasymuluj 20,50,100 użytkowników.

**ćwiczenie 4**

Użyj w teście kontrolerów Interleave, Random, Random Order i zobacz jakie są między nimi różnice. Pod kontrolerem dodaj 2 samplery.

```powershell
    Controller:
        /sampler1
        /sampler2
```

