$path="C:\Users\gstarczewski\tools\apache-jmeter-5.2.1\bin"
$testName="test-0099.jmx"
$JMeterArgs="-f -l results/results.csv -e -o results/html"
Invoke-Expression "$path\jmeter.bat -n -t $testName $JMeterArgs"