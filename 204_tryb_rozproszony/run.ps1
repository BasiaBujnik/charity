$path="C:\Users\gstarczewski\tools\apache-jmeter-5.2.1\bin"
$testName="test-204.jmx"
$JMeterArgs="-R 127.0.0.1"
Invoke-Expression "$path\jmeter.bat -n -t $testName $JMeterArgs"