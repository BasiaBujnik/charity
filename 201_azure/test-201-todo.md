## Parametryzacja pipeline'a

1. Użyj [zmiennych](https://docs.microsoft.com/en-us/azure/devops/pipelines/process/variables?view=azure-devops&tabs=yaml%2Cbatch
) i [parametrów](https://docs.microsoft.com/en-us/azure/devops/pipelines/process/runtime-parameters?view=azure-devops&tabs=script) w Azure aby 
liczbę wątków i nazwę testu  można było określać podczas uruchomienia pipeline'u (jmeter_from_binary | jmeter_from_docker)
        
        odwołanie do zmiennej: $(zmienna)
        odwołanie do parametru: ${{ parameters.parametr }}
        
2. Zrefaktoruj pipeline usuwając powtórzenia