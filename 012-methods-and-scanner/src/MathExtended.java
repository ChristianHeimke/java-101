import java.util.Scanner;

public class MathExtended {
  public static void main(String[] args) {

    // scanner definieren
    Scanner scanner = new Scanner(System.in);

    // Anzahl der Zahlen erfragen
    System.out.println("Wie viele Zahlen sollen addiert werden? Geben Sie die Anzahl ein: ");
    int anzahlZahlen = scanner.nextInt();

    // array in der größe der zu erwartenden Zahlen anlegen
    int[] zahlenEingabe = new int[anzahlZahlen];

    // Schleife über die Menge der Zahlen
    for(int i=0; i<anzahlZahlen; i++){
      System.out.println("Geben Sie bitte die Zahl " + (i+1) + " ein: ");
      // Eingabe im Array speichern
      zahlenEingabe[i] = scanner.nextInt();
    }

    // Ergebnis aller Zahlen in dem Array
    int result = add(zahlenEingabe);

    // Ergebnis ausgeben
    System.out.println("Ergebnis der Addition ist: " + result);
  }

  // funktion zum addieren aller Zahlen in einem Array
  private static int add(int[] numbers){
    // Ergebnis ist immer 0
    int result = 0;

    // schleife über das Array um einzelne Zahlen zu addieren
    for(int i = 0; i<numbers.length; i++){
      result += numbers[i];
    }

    // nur die berechnung zurück geben
    return result;
  }
}