import java.util.Scanner;

public class MathBasicTogtherMitEingabe {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Abfrage wie viel Zahlen eingegeben werden soll
    // menge an eingaben als variable
    int anzahlEingaben = 0;

    System.out.print("Bitte geben Sie die Anzahl der Zahlen ein: ");
    anzahlEingaben = scanner.nextInt();

    // array für die menge der eingabe zahlen
    int[] zahlen = new int[anzahlEingaben];

    // schleife über die menge der eingaben (variable siehe oben)
    for(int i=0; i<anzahlEingaben; i++){
      System.out.print("Bitte geben Sie die Zahl " + (1+i) +  "  ein: ");
      // eingaben speichen
      zahlen[i] = scanner.nextInt();
    }

    int ergebnis = add(zahlen);
    System.out.print("Das Ergebnis der Addtion ist: " + ergebnis);

  }

  // zahl addieren
  public static int add(int[] zahlen){
    int ergebnis = 0;

    for(int i = 0; i < zahlen.length; i++){
      ergebnis += zahlen[i];
    }

    return ergebnis;
  }

}