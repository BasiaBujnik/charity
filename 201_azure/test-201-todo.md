## Parametryzacja pipeline'a

1. U¿yj [zmiennych](https://docs.microsoft.com/en-us/azure/devops/pipelines/process/variables?view=azure-devops&tabs=yaml%2Cbatch
) i [parametrów](https://docs.microsoft.com/en-us/azure/devops/pipelines/process/runtime-parameters?view=azure-devops&tabs=script) w Azure aby 
liczbê w¹tków i nazwê testu  mo¿na by³o okreœlaæ podczas uruchomienia pipeline'u (jmeter_from_binary | jmeter_from_docker)
        
        odwo³anie do zmiennej: $(zmienna)
        odwo³anie do parametru: ${{ parameters.parametr }}
        
2. Zrefaktoruj pipeline usuwaj¹c powtórzenia