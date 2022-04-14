/*

Aufgabenstellung: Geben Sie ein Wort Rückwärts aus!

Lösung (einfach und unelegant):

* Wort wird als Eingabe festgelegt
* Eingabe-Wort wird der Länge nach durchgegangen über die .charAt() Methode - aber von hinten nach vorne
* Ergebnis wird ausgegeben

*/

public class Rueckwaerts {

  public static void main(String[] args) {
    String wort  = "Hallo";                           // Eingabewort
    String neuesWort = "";                            // Ausgabewort

    for(int i = wort.length()-1; i >= 0; i--){        // Schleife die das Eingabewort von hinten nach vorn durchgeht
      neuesWort += wort.charAt(i);                    // Buchstabe wird in das neue Wort übernommen
    }

    System.out.println("Altes Wort: " + wort);        // Ausgabe Eingabewort
    System.out.println("Neues Wort: " + neuesWort);   // Ausgabe Eingabewort rückwärts

  }
}
