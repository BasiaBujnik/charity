## Jest kilka elementów, które waro znaæ w ca³ym panteonie JMetera

1. **Transaction controller** - agreguje wiele transakcji pod wspólnym szyldem, czêsto u¿ywany jest do agregacji Page Views
2. **Constant Throughput timer** - wymusza wysy³anie ¿¹dañ z okreœlon¹ prêdkoœci¹ np. 100/minutê *
3. **Once Only Controller** - wykonuje akcjê raz w ramach w¹tku


\* - CTT mo¿e jedynie zwalniaæ ¿¹dania wiêc w celu osi¹gniêcia po¿¹danej prêdkoœci musimy mieæ wystarczaj¹co wiele w¹tków i system musi odpowiadaæ odpowiednio szybko

To bêdzie ostatnie æwiczenie, w któym rozbudowujemy nasz test. Zrobimy wiêc równie¿ krótkie podsumowanie.