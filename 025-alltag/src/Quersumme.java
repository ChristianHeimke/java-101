/*

Aufgabenstellung: Bilden Sie die Quersumme einer Zahl!

Lösung (einfach und unelegant):

* Zahl wird als Integer vorgegeben
* Zahl wird in String umgewandelt
* Eingabe-Zahl wird der Länge nach durchgegangen über die .charAt() Methode
* "Buchstabe" wird wieder zu einer Zahl umgewandelt und aufaddiert
* Ergebnis wird ausgegeben

*/

public class Quersumme {

  public static void main(String[] args) {
    int zahl = 231;                                               // Eingabezahl
    int ergebnis = 0;                                             // Variable für das Ergebnis

    String zahlString = String.valueOf(zahl);                     // Umwandlung der Zahl zu einem String

    for(int i = 0; i < zahlString.length(); i++){                 // Schleife um die "Zahl" Position für Position durchzugehen
      ergebnis += Integer.parseInt(""+zahlString.charAt(i));      // Buchstabe an Position i wird wieder in eine Zahl verwandelt um aufaddiert
    }

    System.out.println("Zahl: " + zahlString);                    // Ausgabe Eingabezahl
    System.out.println("Quersumme: " + ergebnis);                 // Ausgabe Quersumme

  }
}
