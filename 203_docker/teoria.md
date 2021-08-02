## Docker i JMeter

Zajmiemy su� budow� obrazu Dockerowego z JMeterem i pluginami, kt�rych u�ywamy. To nie jest rocket science :)

![not rocket science](https://media1.tenor.com/images/69ed8ada5228636d893a9477078cf4d6/tenor.gif)

Docker wzi�� si� z potrzeby oscz�dno�ci zasob�w:

![Docker](img/docker.png)
     
        �r�d�o: edureka.co
        
Podstawowymi elementami, z kt�rym wchodzimy w interakcj� s� obrazy i kontenery.
        
![Docker](img/architecture.svg)
        
        �r�d�o: docker.com
        
        
Wi�kszo�� deweloper�w u�ywa Dockera aby rozwi�za� problem zale�no�ci systemowych. Sp�jrzmy na przyk�ad:

```dockerfile
 # syntax=docker/dockerfile:1
 FROM node:12-alpine
 RUN apk add --no-cache python g++ make
 WORKDIR /app
 COPY . .
 RUN yarn install --production
 CMD ["node", "src/index.js"]
```

Nawet w tak prostym pliku definiujemy obraz jako:

- pewien system operacyjny :) //to rozwi�zuje mas� problem�w
- rozszerzony o programy, kt�re doinstalowujemy
- z pewnymi ustawieniami

Podstawowe komendy dockera znajdziecie w [docker](../docker/docker.md)