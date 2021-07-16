$path="C:\Users\gstarczewski\tools\apache-jmeter-5.2.1\bin"
$testName="odpowiedz.jmx"
$JMeterArgs="-Jthreads=1 -Jloops=2 -JrampUp=1 -j results/jmeter.log -f -l results/results.csv -e -o results/html"
Invoke-Expression "$path\jmeter.bat -n -t $testName $JMeterArgs"