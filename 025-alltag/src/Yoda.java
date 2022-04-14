import java.util.Arrays;
/*

Aufgabenstellung: Drehen Sie einen Satz um!
Beispiel:
 * Eingabe: hallo ich bin yoda
 * Ausgabe: yoda bin ich hallo

Lösung (einfach und unelegant):

* Satz wird als Eingabe vorgegeben
* Bestimmen aller Wörter anhand der Leerzeichen + 1 (letztes Wort hat kein Leerzeichen mehr)
* Array wird angelegt basierend auf der Anzahl der Wörter
* Verschachtelte Schleifen kopieren Buchstabe für Buchstabe jedes Wort als ganzens in ein Array (Wort ist immer zwischen zwei leerzeichen)
* Array mit Wörtern wird von hinten nach vorn ausgegeben
* Wörter sind in richtiger Leserichtung, aber in umgedrehter Reihenfolge

*/
public class Yoda {
  public static void main(String[] args) {
    String satz = "Hallo ich bin yoda";         // Eingabesatz

    /*************** Wörter ermitteln *************************************************************/
    int anzahlWoerter = 0;                      // Zählvariable für Wörter

    for (int i = 0; i < satz.length(); i++) {   // Schleife zum ermitteln der Wörter
      if (satz.charAt(i) == ' ') {              // Zählen aller Leerzeichen
        anzahlWoerter++;
      }
    }

    anzahlWoerter++;                            // es gibt immer ein Leerzeichen weniger als Wörter in einem Satz

    /*************** Array für Wörter *************************************************************/
    String woerter[] = new String[anzahlWoerter]; // Array für die Wörter anlegen
    int start = 0;                                // Startposition entspricht dem ersten Buchstaben

    /*************** Satz zerlegen ****************************************************************/
    for (int i = 0; i < anzahlWoerter; i++) {     // Schleife für die Wörtrr
      String wort = "";                           // aktuelles Wort wird immer zurückgesetzt

      for (int j = start; j < satz.length(); j++) { // satz wird immer an der Startposition angefangen
        if (satz.charAt(j) == ' ') {                // wird ein leerzeichen gefunden
          start = j+1;                              // ist die startposition der wortanfang des nächsten worts

          break;                                    // und die innere schleife wird abgebrochen
        } else {
          wort += satz.charAt(j);                   // alles was kein leerzeichen ist wird als wort zusammengebaut - Buchstabe für Buchstabe
        }
      }
      woerter[i] = wort;                            // wenn die innere Schleife abgebrochen wurde, wird das Wort als ganzes in das Array übernommen
    }

    /*************** Satz neu bauen * *************************************************************/
    String neuerSatz = "";                          // Variable für den neuen Satz

    for(int i=anzahlWoerter-1; i>=0;i--){           // Array mit Worten wird von hinten nach vorne durchgegangen
      neuerSatz += woerter[i];                      // Wort wird in die Varialbe übernommen
      neuerSatz += " ";                             // und ein Leerzeichen zum Abstandhalten eingefügt
    }

    /*************** Ausgabe **********************************************************************/
    System.out.println(neuerSatz);                  // Ausgabe neuer Satz
  }
}
