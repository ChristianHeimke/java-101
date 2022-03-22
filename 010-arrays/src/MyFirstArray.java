public class MyFirstArray {

  public static void main(String[] args) {
    // alt → uncool da unbekannte Menge an Elementen
    // String javaKlasse = "Markus, Kevin, Lukas, Max";

    // neu
    // String Array
    String[] javaKlasse = {"Markus", "Kevin", "Lukas", "Max", "Lee", "Patrick", "Emine"};

    // Arraygröße ermitteln
    int teilnehmerAnzahl = javaKlasse.length;

    System.out.println();
    System.out.println("Anzahl der Einträge: " + teilnehmerAnzahl);

    // Alle Elemente ausgeben
    // wichtig: das 1. Element ist an Position 0,
    // das letzte Element an (ArrayLänge - 1)
    for(int idx = 0; idx < teilnehmerAnzahl; idx++){
      System.out.println(javaKlasse[idx]);
    }

  }
}
