## Parametryzacja pipeline'a

1. U�yj [zmiennych](https://docs.microsoft.com/en-us/azure/devops/pipelines/process/variables?view=azure-devops&tabs=yaml%2Cbatch
) i [parametr�w](https://docs.microsoft.com/en-us/azure/devops/pipelines/process/runtime-parameters?view=azure-devops&tabs=script) w Azure aby 
liczb� w�tk�w i nazw� testu  mo�na by�o okre�la� podczas uruchomienia pipeline'u (jmeter_from_binary | jmeter_from_docker)
        
        odwo�anie do zmiennej: $(zmienna)
        odwo�anie do parametru: ${{ parameters.parametr }}
        
2. Zrefaktoruj pipeline usuwaj�c powt�rzenia