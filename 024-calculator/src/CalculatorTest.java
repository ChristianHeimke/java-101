import java.util.Scanner;

public class CalculatorTest {

  public static void main(String[] args) {
    // Klasse Calculator die die Berechnung übernimmt
    // auf Basis der Eingabe und Operator
    Calculator c = new Calculator();

    // Erfassen der Eingabe
    Scanner scanner = new Scanner(System.in);

    // Trick für die Endlosschleife - sie geht solange bis der Wert über 0 ist
    int a = -1;
    int b = -1;

    // bei dem operator müssen wir solange warten bis die Eingabe valide ist
    boolean validOperator = true;

    // Operator mit default Wert
    Operator op = Operator.ADD;

    // Schleife für die 1. Zahl
    while (a < 0) {
      try {
        System.out.print("Gib die erste Zahl ein: ");
        a = scanner.nextInt();
      } catch (Exception e) {
        scanner.next();
      }
    }

    // Schleife für die 1. Zahl
    while (b < 0) {
      try {
        System.out.print("Gib die zweite Zahl ein: ");
        b = scanner.nextInt();
      } catch (Exception e) {
        scanner.next();
      }
    }

    // Schleife für den Operator
    // Fußgesteuert, damit man mind. einmal durch läuft und nach der Operation fragt
    do {
      validOperator = true;

      try {
        System.out.print("Gib den Operator ein, gültig ADD, SUB, MULT, DIV: ");
        op = Operator.valueOf(scanner.next());

      } catch (Exception e) {
        System.out.println("Die Eingabe war ungültig");
        validOperator = false;
      }
    } while (!validOperator); // schleife läuft solange bis es einen validen Operator gibt
    // alternative schreibweise: while(validOperator == false)

    // Ausgabe der Berechnung
    try {
      System.out.println(c.calculate(a, b, op));
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }

  }

}
