# Multithreading
###   Teoria del multithreading:
>Il multithreading è un tipo di sviluppo che consente di eseguire diverse parti di un programma contemporaneamente o in rapida successione.
>Serve a ridurre i tempi di esecuzione del programma, che termina l'elaborazione dati in minor tempo.

**Abbiamo creato un programma di test per verificare il funzionamento dei thread. Il programma manda in output una serie di "Hi" e "Hello" per 10 volte ciascuno. L'ordine dell'output non è regolare, funziona infatti in base all'algoritmo di esecuzione.**

>Esempio output 1: Hi Hi Hi Hi Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hi Hi Hi Hi Hi Hi

>Esempio output 2: Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello

>Esempio output 3: Hi Hi Hello Hello Hello Hello Hello Hello Hello Hello Hello Hello Hi Hi Hi Hi Hi Hi Hi Hi

* **Le versioni del programma sono 2:** con le classi *Hi* ed *Hello*, e con la classe unica *Say*.
  * **Classi _Hi_ ed _Hello_:**
    Dopo aver creato due oggetti di classe _Hi_ ed _Hello_, li abbiamo mandati in esecuzione come _Thread_. La classe _Hi_ manda in output la scritta "Hi" 10 volte, e la classe _Hello_ fa la stessa cosa ma la scritta in output è "Hello".
    >***Da notare che le classi devono estendere un thread. Le istruzioni sono contenute in un metodo run(); i thread verranno avviati tramite la chiamata nel main con il metodo *nome oggetto*.start().***
      * **Classe _Say_:**
      A differenza della versione precedente, questa contiene solo un metodo _Say_, invece che due metodi _Hi_ ed _Hello_.
      Il programma sarà quindi più leggero e comprensibile, avendo da eseguire una sola classe invece che due.
      I due oggetti avranno la stessa classe _Say_, e il loro output sarà differente grazie all'attributo ***cosaDire*** richiesto in input dal costruttore. La classe _Say_ semplicemente conterrà un metodo **run()** dentro il quale ci sarà un ciclo che manderà in output 10 volte la stringa _cosaDire_.
