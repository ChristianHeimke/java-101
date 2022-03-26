import java.util.Scanner;

public class MathBasic {
  public static void main(String[] args) {

    // scanner definieren
    Scanner scanner = new Scanner(System.in);

    // Zahl 1 eingeben lassen
    System.out.println("Geben Sie die erste Zahl ein: ");
    int number1 = scanner.nextInt();

    // Zahl 2 eingeben lassen
    System.out.println("Geben Sie die zweite Zahl ein: ");
    int number2 = scanner.nextInt();

    // ergebnis ausrechnen über neue methode
    int result = add(number1, number2);

    // Ergebnis ausgeben
    System.out.println("Ergebnis der Addition ist: " + result);
  }

  // funktion zum addieren zwei integer
  private static int add(int number1, int number2){
    // nur die berechnung zurück geben
    return number1 + number2;
  }
}