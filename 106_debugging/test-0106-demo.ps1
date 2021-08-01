Remove-Item "$PSScriptRoot/logs" -Recurse -erroraction 'silentlycontinue'
New-Item -Path "$PSScriptRoot" -Name "logs" -ItemType "directory" -Force

$path="C:\Users\gstarczewski\tools\apache-jmeter-5.2.1\bin"
$testName="test-0106-begin.jmx"
Invoke-Expression "$path\jmeter.bat -LDEBUG -f -n -t $testName -j logs\jmeter.log" #udv prop set in command
