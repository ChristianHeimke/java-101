public class MySecondArray {

  public static void main(String[] args) {
    // alt → uncool da unbekannte Menge an Elementen
    // String javaKlasse = "Markus, Kevin, Lukas, Max";

    // neu
    // String Array mit der Länge 10 anlegen
    String[] javaKlasse = new String[10];

    // Array Ausgeben:
    for(int idx = 0; idx < javaKlasse.length; idx++){
      System.out.println(javaKlasse[idx]);
    }

    // Trennlinie
    System.out.println("------------------------");

    // Array befüllen
    for(int idx = 0; idx < javaKlasse.length; idx++){
      javaKlasse[idx] = "Ich bin Element #" + idx;
    }

    // Ein Element wieder löschen
    javaKlasse[4] = null;

    // Array Ausgeben:
    for(int idx = 0; idx < javaKlasse.length; idx++){
      System.out.println(javaKlasse[idx]);
    }

    System.out.println("------------------------");

    // prüfen ob ein Element existiert
    for(int idx = 0; idx < javaKlasse.length; idx++){
      System.out.print("Element an Position #" + idx + " existiert: ");

      if(javaKlasse[idx] != null){
        System.out.println("ja");
      }else{
        System.out.println("nein");
      }
    }

  }
}
