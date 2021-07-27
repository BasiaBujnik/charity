$path="C:\Users\gstarczewski\tools\apache-jmeter-5.2.1\bin"
$testName="odpowiedz.jmx"
$JMeterArgs="-Jthreads=1 -Jloops=2 -JrampUp=1 -j results/jmeter.log -l results/results.csv"
Invoke-Expression "$path\jmeter.bat -f -n -t $testName ${JMeterArgs}"