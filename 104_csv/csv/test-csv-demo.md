W tej części:

1. Stworzymy prosty test, który pokaże jak można zczytać dane z pliku
2. Zobaczymy jak można odwołać się do katalogu z testem w JMeter

    ` ${__groovy(import org.apache.jmeter.services.FileServer; FileServer.getFileServer().getBaseDir();)}/test-csv-demo_result.csv`
    
3. Stworzymy test wysyłający żądania do bing.com, i zmieniający domenę na kod kraju z pliku CSV
    GET bing.es
    GET bing.it
    GET bing.pl
    ....
    