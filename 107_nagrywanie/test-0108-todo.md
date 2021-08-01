## nagrywanie ruchu

1. Skonfiguruj i nagraj ruch ponownie, u�ywaj�c do grupowania Transaction Controllera, ustaw:
    - w HTTP  Sampler settings:  Naming scheme: prefix, Transaction name: 'appxx'
    - zaznacz 'Put each group into a Transaction Controller'
    - dodaj element UDV aby zrobi� podstawow� korelacj�:
    
        |  Name | Value   |  
        |---|---|
        |   frontend| red-water-022d04b03.azurestaticapps.net  |  
        |  backend | appxx.azurewebsites.net  |   
  

    - odegraj ruch
    
2. Opcjonalnie:
    - odfiltruj statyczne pliki - URL Patterns to Exclude: (?i).*\.(bmp|css|js|gif|ico|jpe?g|png|swf|woff|woff2|js|ttf)
     - zaznacz Retrieve Embedded Resources
