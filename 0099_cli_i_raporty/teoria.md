# Jak prawidłowo uruchamiać testy?

GUI powinno być używane jedynie do dewelopmentu testów. Podczas prawdziwych pomiarów powinniśmy korzystać z CLI. Wszystkie zbędne elementy powinny być wyłączone.

Przykład:

```powershell

$path="C:\Users\gstarczewski\tools\apache-jmeter-5.2.1\bin"
Invoke-Expression "$path\jmeter.bat -n -t test-0099.jmx"

```