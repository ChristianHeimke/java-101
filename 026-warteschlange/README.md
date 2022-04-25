#  Warteschlange

Ziel der Übung ist es die Implementierung von Datenstrukturen in Java zu üben.
Öffnen Sie dafür die Entwicklungsumgebung Eclipse und legen Sie ein neues Projekt mit dem Namen „Warteschlange in Java“ an.
Sie sollen die Datenstruktur Warteschlange (englisch Queue) in Java implementieren. Eine Warteschlange arbeitet nach dem
first in first out (FIFO) Prinzip, das heißt neue Elemente werden an die letzte Position der Warteschlange eingefügt und es
wird immer das Element an der ersten Position entfernt. Die Größe der Warteschlange erweitert sich dynamisch. Arbeiten Sie
ohne Generics.

Links: https://de.wikipedia.org/wiki/Warteschlange_(Datenstruktur).


* Erstellen Sie die Klasse ArrayQueue, diese soll das Queue-Interface implementieren:
  ```java
  public interface Queue {
    boolean isEmpty();
    int size();
    void enqueue(Object element); Object dequeue();
  }
  ```
  Übernehmen Sie dafür das Queue-Interface in Ihr Projekt.
* Die Warteschlange soll die Elemente intern in einem Array vom Typ `Object` abspeichern.
* Implementieren Sie die Methoden des `Queue`-Interface in der `MyQueue`-Klasse unter
Verwendung des Arrays aus 2.
* Implementieren Sie die `isEmpty`-Methode, diese soll `true` zurückgeben, wenn die
Warteschlange leer ist, ansonsten `false`.
* Implementieren Sie die `size`-Methode, diese soll die Anzahl der Elemente in der
Warteschlange als Integer Wert zurückgeben.
* Implementieren Sie die `enqueue`-Methode, diese soll ein neues Element an das Ende
der Warteschlange hinzufügen.
* Implementieren Sie die `dequeue`-Methode, diese soll das erste Element in der
Warteschlange entfernen und zurückgeben. Dabei rückt das zweite Element an die
erste Position.

* Testen Sie Ihre Implementierung. Dabei soll die erzeugte Queue-Instanz nur Objekte vom Typ
`String` abspeichern. Beim Aufruf der `dequeue`-Methode muss darauf geachtet werden, dass der Rückgabewert wieder in einen
`String` gecasted wird. Was passiert, wenn aus Versehen ein Integer-Objekt der Warteschlange hinzugefügt wird und mittels der
`dequeue`-Methode aus der Warteschlange entfernt wird und in einen String gecasted wird?