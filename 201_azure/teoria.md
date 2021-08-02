## JMeter w Azure DevOps

Wykonanie test�w w systemie CI/CD (Azure DevOps lub innym) to nic innego jak automatyzacja. Zanim b�dziemy automatyzowa� musimy wiedzie� co automatyzujemy. Opiszmy wi�c zadanie w postaci krok�w:

- Pobierz repozytorium z testami (wymagane)
- Zainstaluj JMetera (wymagane)
- Uruchom Testy (wymagane)
- Opublikuj wynik test�w (opcjonalne)
- Opublikuj artefakty testowe (opcjonalne)

Do automatyzacji wyorzystujemy pipeline'y. Automatyzacj� implementujemy korzystaj�c z gotowych element�w pipeline'a (step�w) lub rozszerze�, kt�re mo�emy zainstalowa� z Azure Marketplace. 

Pipeline ma nast�puj�c� [struktur�](https://docs.microsoft.com/en-us/azure/devops/pipelines/yaml-schema?view=azure-devops&tabs=schema%2Cparameter-schema):

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

Podstawowe metody puszczania test�w w Azure DevOps na agentach Microsoftu s� nast�puj�ce:

1. **Jako release pipeline**

    Release pipeline'y zosta�y stworzone do wdra�ania aplikacji ale mog� te� s�u�y� do automatyzacji. Polegaj� na r�cznej konfiguracji i na chwil� obecn� nie mo�na ich zapisa� w postaci YAML.

    ![release pipeline](img/releasePipeline.png)

2.  **Jako build pipeline (YAML) z u�yciem binarki**
    
    ![build pipeline](img/pipelineBinary.png)
    
3. **Jako build pipeline (YAML) z u�yciem kontenera dockerowego**
    
    ![docker pipeline](img/pipelineDocker.png)
    
***

Je�eli u�ywamy prywatnych agent�w, JMeter mo�e by� na nich doinstalowany przez zesp� DevOps. Nie trzeba wtedy instalowa� JMetera za ka�dym razem.
Mo�liwe s� ro�ne wariacje tych podej��.
 