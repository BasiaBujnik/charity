$path="C:\Users\gstarczewski\Downloads\apache-jmeter-5.4.1\bin"
$here="C:\Users\gstarczewski\Desktop\gab\jenkins\charity\0099_cli_i_raporty"
$testName="test-0099-begin.jmx"
$stamp=Get-Date  -Format "dddd_MM_dd_yyyy_HH_mm"
#log && result files
Invoke-Expression "$path\jmeter.bat -f -n -t $here\$testName -j C:\tmp\report\$stamp-jmeter.log -l C:\tmp\report\$stamp-results.csv"
