/*

  Endlosschleife

*/
public class AsteriskLanes {

  public static void main(String[] args) {

    int n = 10;

    for(int i = 0; i < n; i++){

      // Anfang der Zeile
      System.out.print("*");

      for(int j = 1; j < (n-1); j++){
        // Zwischen raum füllen minus zwei zeichen
        System.out.print(" ");
      }

      // Ende der Zeile
      System.out.println("*");
    }

  }
}
