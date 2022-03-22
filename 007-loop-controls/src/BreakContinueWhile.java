/*

  Erstellen Sie in Ihrer Entwicklungsumgebung eine Schleife, die von 0 bis 100 zählt und
  beachten Sie dabei folgende Informationen:

    * Sollte die Zahl die Zahl 74 erreicht, soll die Schleife sofort beendet werden.
    * Sollte die Zählvariable durch 9 teilbar sein (Rest 0) dann soll sofort zum Schleifenkopf
      zurückgekehrt werden und nichts ausgegeben werden.
    * Als letzte Anweisung in der Schleife soll die Zählvariable auf der Konsole ausgegeben werden.

*/
public class BreakContinueWhile {

  public static void main(String[] args) {

    int i = 0;

    while (i <= 100) {
      i++;

      if (i == 74) {
        break;
      }

      if (i % 9 == 0) {
        continue;
      }
      System.out.println(i);

    }

  }
}
