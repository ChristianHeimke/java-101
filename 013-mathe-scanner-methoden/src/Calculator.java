import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    // scanner definieren
    Scanner scanner = new Scanner(System.in);

    // Eingabe holen
    System.out.print("Geben Sie die erste Zahl an: ");
    int zahl1 = scanner.nextInt();

    System.out.print("Geben Sie die zweite Zahl an: ");
    int zahl2 = scanner.nextInt();

    // Eingabe des Benutzers holen
    System.out.println("Welche mathematische Operation soll ausgeführt werden?");
    System.out.println("1 - Addition");
    System.out.println("2 - Subtraktion");
    System.out.println("3 - Multiplikation");
    System.out.println("4 - Division");
    System.out.println("5 - Alle");
    System.out.print("Geben Sie die Zahl ein: ");

    int eingabeOperation = scanner.nextInt();

    // ggf. hier prüfen ob die eingabe zwischen 1 und 5 war, falls nicht erneut fragen mittels schleife

    switch(eingabeOperation){
      case 1:
        System.out.println("Ergebnis der Addition: " + add(zahl1, zahl2));
        break;
      case 2:
        System.out.println("Ergebnis der Subtraktion: " + sub(zahl1, zahl2));
        break;
      case 3:
        System.out.println("Ergebnis der Multiplikation: " + mul(zahl1, zahl2));
        break;
      case 4:
        System.out.println("Ergebnis der Division: " + div(zahl1, zahl2));
        break;
      case 5:
        System.out.println("Ergebnis der Addition: " + add(zahl1, zahl2));
        System.out.println("Ergebnis der Subtraktion: " + sub(zahl1, zahl2));
        System.out.println("Ergebnis der Multiplikation: " + mul(zahl1, zahl2));
        System.out.println("Ergebnis der Division: " + div(zahl1, zahl2));
        break;
      default:
        System.out.println("Dies ware keine gültige Option!");
    }
  }

  // Addition
  private static int add(int zahl1, int zahl2){
    return zahl1 + zahl2;
  }

  // Subtraktion
  private static int sub(int zahl1, int zahl2){
    return zahl1 - zahl2;
  }
  // Multiplikation
  private static int mul(int zahl1, int zahl2){
    return zahl1 * zahl2;
  }

  // Divison
  private static float div(int zahl1, int zahl2){
    if(zahl2 == 0){
      return 0;
    }

    return (float) zahl1 / (float)zahl2;
  }
}