Remove-Item "$PSScriptRoot/results" -Recurse
Remove-Item "$PSScriptRoot/report-output" -Recurse
Remove-Item "$PSScriptRoot/logs" -Recurse

New-Item -Path "$PSScriptRoot" -Name "html" -ItemType "directory" -Force
New-Item -Path "$PSScriptRoot" -Name "results" -ItemType "directory" -Force
New-Item -Path "$PSScriptRoot" -Name "logs" -ItemType "directory" -Force

$path="C:\Users\gstarczewski\tools\apache-jmeter-5.4.1\bin"
$testName="UserDefinedVariables.jmx"
Invoke-Expression "$path\jmeter.bat -LDEBUG -f -n -t $testName -j logs\jmeter.log -l results\results.csv -Judv=3333"