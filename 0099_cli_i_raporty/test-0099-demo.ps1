#Disable in reportgenerator.properties as there is a bug around this
#jmeter.reportgenerator.exporter.json.classname=org.apache.jmeter.report.dashboard.JsonExporter
#jmeter.reportgenerator.exporter.json.property.output_dir=report-output

$path="C:\Users\gstarczewski\Downloads\apache-jmeter-5.4.1\bin"
$here="C:\Users\gstarczewski\Desktop\gab\jenkins\charity\0099_cli_i_raporty"
$testName="test-0099-begin.jmx"
$stamp=Get-Date  -Format "dddd_MM_dd_yyyy_HH_mm"
#log && result files
Write-Host "$path\jmeter.bat -f -n -t $here\$testName -j $here\report\$stamp-jmeter.log -l $here\report\$stamp-results.csv"
Invoke-Expression "$path\jmeter.bat -LTRACE -f -n -t $here\$testName -j $here\report\$stamp-jmeter.log -l $here\report\$stamp-results.csv -e -o C:\tmp\$stamp\"
