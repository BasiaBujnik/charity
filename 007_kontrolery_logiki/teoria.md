## Kontrolery logiki

Przypomnijmy sobie, że:

**Kontrolery logiki** - sterują przepływem programu, są to np. if, for, while, ... znane nam z programowania

**Samplery** - wykonują jednostkę pracy np. wysyłają żądanie HTTP

Jak używać kontrolerów najlepiej wytłumaczyć na najbardziej skomplikowanym przykładzie jakim jest ``if``

**IF** - akcja/część testu zdefiniowana pod tym kontrolerem wykona się jeśli warunek logiczny (wyrażenie), który IF ewaluuje jest równy logicznemu `true`
> performs actions underneath if logical condition is true

Ok, a teraz jak może wyglądać wyrażenie?:
***
JavaScript (variable expression odznaczone)

```javascript 
    JS1: ${JMeterThread.last_sample_ok} - returns true, executes if last sample in execution chain was OK
    JS2: "${loops}"=="2" - evaluates to true
    JS3: "${performIf}" or ${performIf}, Given performIf is set to "true"
    JS4: var a = function(){ return true;}; a(); - anonymous function in JS
    JS5: var a = function() {return "${loops}"==="2";};a(); - plain JS executed, strict comparisom
```
***
Groovy (variable expression zaznaczone)
```groovy 

    Groovy1: ${__groovy("${loops}"=="2")} , with Variable Expression checked
    Groovy2: ${__groovy(${loops} as int==2)}, alternative
```

JMeter rekomenduje Groovy jako język skryptowy do elementów JMeter ze względu na wydajność.