## nagrywanie ruchu

1. Skonfiguruj i nagraj ruch ponownie, używając do grupowania Transaction Controllera, ustaw:
    - w HTTP  Sampler settings:  Naming scheme: prefix, Transaction name: 'appxx'
    - zaznacz 'Put each group into a Transaction Controller'
    - dodaj element UDV jako dziecko _Test Script Recordera_ aby wykonać  podstawową korelację:
    
        |  Name | Value   |  
        |---|---|
        |   frontend| red-water-022d04b03.azurestaticapps.net  |  
        |  backend | appxx.azurewebsites.net  |   
  
    - odegraj ruch, jak zmienił się Twój test ?
    
2. Opcjonalnie:
    - odfiltruj statyczne pliki - Request Filtering/URL Patterns to Exclude: (?i).*\.(bmp|css|js|gif|ico|jpe?g|png|swf|woff|woff2|js|ttf)
    - zaznacz Retrieve Embedded Resources - zobacz jak zmieni się Twój test


> W Twoim nagraniu może pojawić się element [Authorization Manager](https://octoperf.com/blog/2018/04/24/jmeter-basic-authentication/#configuration-2), który również wykorzystywany jest do _basic auth_ 