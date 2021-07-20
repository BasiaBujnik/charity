Remove-Item "$PSScriptRoot/results" -Recurse
$path="C:\Users\gstarczewski\tools\apache-jmeter-5.4.1\bin"
$testName="UserDefinedVariables.jmx"
$JMeterArgs="-Judv=3333 -j $PSScriptRoot/results/jmeter.log -e -o $PSScriptRoot/results -l $PSScriptRoot/results/results.csv"
Write-Host "$path\jmeter.bat -n -t $testName $JMeterArgs"
Invoke-Expression "$path\jmeter.bat -n -t $testName $JMeterArgs"