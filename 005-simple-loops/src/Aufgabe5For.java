/*

  Geben Sie auf der Konsole aus, wie oft die 2 in eine Zahl (n) passt.

  Der Rest soll nicht beachtet werden.Nutzen Sie auch dafür eine Schleife.

  Beispiele:

  n=23  Ausgabe: „11“ weil 23 : 2 = 11
  n=14  Ausgabe: „7“ weil 14 : 2 = 7

*/
public class Aufgabe5For {

  public static void main(String[] args) {

    int n = 23;     // Eingabe
    int count = 0;  // Anzahl wie oft die 2 in die Zahl passt

    for(int i = n; i > 0; i--){
      if ((i % 2) == 0) {
        count++;
      }
    }

    System.out.println("Die Zahl 2 passt " + count + " Mal in " + n);
  }
}
