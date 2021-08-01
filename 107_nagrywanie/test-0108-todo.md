## nagrywanie ruchu

1. Skonfiguruj i nagraj ruch ponownie oszczêdzaj¹c sobie nieco pracy:
    - zaznacz Retrieve Embedded Resources aby nie zapisywaæ ich pojedynczo
    - odfiltruj statyczne pliki - URL Patterns to Exclude: (?i).*\.(bmp|css|js|gif|ico|jpe?g|png|swf|woff|woff2|js|ttf)
    - ustaw prefix na 'appxx'
    - zaznacz 'Put each group into a Transaction Controller'
    - dodaj UDV:
        frontend | red-water-022d04b03.azurestaticapps.net
        backend  | appxx.azurewebsites.net
    - odegraj ruch