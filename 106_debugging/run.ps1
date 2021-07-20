Remove-Item "$PSScriptRoot/results" -Recurse -erroraction 'silentlycontinue'
Remove-Item "$PSScriptRoot/report-output" -Recurse -erroraction 'silentlycontinue'
Remove-Item "$PSScriptRoot/logs" -Recurse -erroraction 'silentlycontinue'

New-Item -Path "$PSScriptRoot" -Name "html" -ItemType "directory" -Force
New-Item -Path "$PSScriptRoot" -Name "results" -ItemType "directory" -Force
New-Item -Path "$PSScriptRoot" -Name "logs" -ItemType "directory" -Force

$path="C:\Users\gstarczewski\tools\apache-jmeter-5.2.1\bin"
$testName="test-0107-odpowiedz.jmx"
Invoke-Expression "$path\jmeter.bat -LDEBUG -f -n -t $testName -j logs\jmeter.log -l results\results.csv" #udv prop set in command
