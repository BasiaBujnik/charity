$path="C:\Users\gstarczewski\tools\apache-jmeter-5.2.1\bin"
$testName="UserDefinedVariables.jmx"
$JMeterArgs="-Judv=3333 -j results/jmeter.log -f -l results/results.csv -e -o results/html"
Invoke-Expression "$path\jmeter.bat -n -t $testName $JMeterArgs"