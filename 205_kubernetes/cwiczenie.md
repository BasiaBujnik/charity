(To æwiczenie robimy wspólnie z trenerem)

1. Stwórz AKS w Azure Portal
2. Otwórz Cloud Shell
3. Sciagnij Helm Chart:

        curl -L -o jmeter-helm.zip https://github.com/ObjectivityLtd/crux/releases/download/0.8.3/jmeter-cluster.zip
        unzip jmeter-helm.zip
        
4. W AKS w Azure Portal -> Connect -> Sciagnij dane do logowania do AKS.

        az aks get-credentials --resource-group jmeter-group --name k8
        
5. Deploy Helm
        
        helm upgrade jmeter-cluster ./jmeter-cluster/ --install --namespace helm --create-namespace

6. SprawdŸ komponenty i wykonaj kilka poleceñ kubernetesowych
        
        #hardware running
        kubectl get nodes -o wide
        kubectl get po -o wide -n helm
        
        #deployment details
        kubectl get all -n helm
        kubectl get deploy -n helm
        
        #ID MASTER POD'a
        kubectl get po -n helm | grep Running | grep jmeter-master
        
        #enter running pod - master (BASH)
        kubectl exec -ti -n helm $(kubectl get po -n helm | grep jmeter-master | awk '{print $1}') -- bash
        
        #enter one of pod slaves (BASH)
        kubectl exec -ti  -n helm $(kubectl get po -n helm | grep jmeter-slave | awk '{print $1}'  | head -n1) -- bash
        
        #scale workers
        kubectl scale --replicas 0 deployment/jmeter-slaves -n helm  
        kubectl scale --replicas 3 deployment/jmeter-slaves -n helm
                                  
6. Na podstawie instrukcji wykonaj test z dokumentacji deploymentu (uwaga: wyœwietlane s¹ w bashu, potrzebna bêdzie poprawka na powershell)
    
        kubectl exec -i -n helm "$MASTER_POD" -- /bin/bash /load_test selenium_test_chrome_headless.jmx 
        
        
7. (Dla ambitnych) Skopiuj test z tego folderu na master noda do /test/test.jmx i wykonaj go na 6 workerach

         kubectl exec -i -n helm "$MASTER_POD" -- /bin/bash /load_test test.jmx  "-Gthreads=1"