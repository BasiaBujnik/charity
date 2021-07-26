## Urealistycznienie naszego testu

> Reality is not what it seems ... , Diabeł tkwi w szczegółach ... ,

>![trio](img/reality.png)
            
            źródło: https://i.pinimg.com/originals/dd/d7/a2/ddd7a28ec20db1ee3b1b0ab5c1ee31e3.png
W większości przypadków symulujemy ruch WWW pochodzący od użytkowników przeglądarek, oto kilka faktów dotyczących tych aplikacji:

- przeglądarki mają cache
- protokół HTTP jest bezstanowy i większośc przeglądarek polega na ciasteczkach, żeby podtrzymać sesję użytkownika
- przeglądarki mogą pobierać zasoby statyczne strony równolegle (css, js, img, ..)
- użytkownik wykonując akcje na stronie działa z przerwami (tzw. think time)
- przeładowanie jednej strony to zazwyczaj wiele różnych żądań do backendu, które chcemy oceniać sumarycznie

JMeter oferuje następujące elementy, dzięki którym nasz test będzie lepiej symulował przeglądarkę:

- przeglądarki mają cache (**HTTP Cache Manager**)
- protokół HTTP jest bezstanowy i większośc przeglądarek polega na ciasteczkach, żeby podtrzymać sesję użytkownika (**HTTP Cookie Manager**)
- przeglądarki mogą pobierać zasoby statyczne strony równolegle (css, js, img, ..) (**HTTP Request Defaults: Parallel download, download embedded resources**)
- użytkownik wykonując akcje na stronie działa z przerwami (tzw. think time) (**Timery**)
- przeładowanie jednej strony to zazwyczaj wiele różnych żądań do backendu, które chcemy oceniać sumarycznie (**Transaction Controller**)
