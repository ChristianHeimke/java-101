import java.util.Scanner;

public class CalculatorTest {

  public static void main(String[] args) {
    Calculator c = new Calculator();
    Scanner scanner = new Scanner(System.in);

    int a = -1;
    int b = -1;
    boolean validOperator = true;
    Operator op = Operator.ADD;

    while (a < 0) {
      try {
        System.out.print("Gib die erste Zahl ein: ");
        a = scanner.nextInt();
      } catch (Exception e) {
        scanner.next();
      }
    }

    while (b < 0) {
      try {
        System.out.print("Gib die zweite Zahl ein: ");
        b = scanner.nextInt();
      } catch (Exception e) {
        scanner.next();
      }
    }

    do {
      validOperator = true;

      try {
        System.out.print("Gib den Operator ein, gültig ADD, SUB, MULT, DIV: ");
        op = Operator.valueOf(scanner.next());

      } catch (Exception e) {
        System.out.println("Die Eingabe war ungültig");
        validOperator = false;
      }
    } while (!validOperator);

    try {
      System.out.println(c.calculate(a, b, op));
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }

  }

}
