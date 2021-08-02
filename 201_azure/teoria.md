## JMeter w Azure DevOps

Wykonanie testów w systemie CI/CD (Azure DevOps lub innym) to nic innego jak automatyzacja. Zanim bêdziemy automatyzowaæ musimy wiedzieæ co automatyzujemy. Opiszmy wiêc zadanie w postaci kroków:

- Pobierz repozytorium z testami (wymagane)
- Zainstaluj JMetera (wymagane)
- Uruchom Testy (wymagane)
- Opublikuj wynik testów (opcjonalne)
- Opublikuj artefakty testowe (opcjonalne)

Do automatyzacji wyorzystujemy pipeline'y. Automatyzacjê implementujemy korzystaj¹c z gotowych elementów pipeline'a (stepów) lub rozszerzeñ, które mo¿emy zainstalowaæ z Azure Marketplace. 

Pipeline ma nastêpuj¹c¹ [strukturê](https://docs.microsoft.com/en-us/azure/devops/pipelines/yaml-schema?view=azure-devops&tabs=schema%2Cparameter-schema):

```yaml

pipeline:
    stage A:
      job 1:
        step 1.1
        step 1.2
        ...
       job 2:
        step 2.1
        ...
    stage B:
      ...
```


***

Podstawowe metody puszczania testów w Azure DevOps na agentach Microsoftu s¹ nastêpuj¹ce:

1. **Jako release pipeline**

    Release pipeline'y zosta³y stworzone do wdra¿ania aplikacji ale mog¹ te¿ s³u¿yæ do automatyzacji. Polegaj¹ na rêcznej konfiguracji i na chwilê obecn¹ nie mo¿na ich zapisaæ w postaci YAML.

    ![release pipeline](img/releasePipeline.png)

2.  **Jako build pipeline (YAML) z u¿yciem binarki**
    
    ![build pipeline](img/pipelineBinary.png)
    
3. **Jako build pipeline (YAML) z u¿yciem kontenera dockerowego**
    
    ![docker pipeline](img/pipelineDocker.png)
    
***

Je¿eli u¿ywamy prywatnych agentów, JMeter mo¿e byæ na nich doinstalowany przez zespó³ DevOps. Nie trzeba wtedy instalowaæ JMetera za ka¿dym razem.
Mo¿liwe s¹ ro¿ne wariacje tych podejœæ.
 