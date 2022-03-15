/***************************************************************************************************
 * Vergleichsoperatoren
 *
 * Einfache mathematische Vergleiche zwischen zwei Werten:
 *
 * > Größer
 * < Kleiner
 * >= Größer/Gleich
 * <= Kleiner/Gleich
 * == Gleich
 * != Ungleich
 *
 ***************************************************************************************************/
public class RelationalOperator {
  public static void main(String[] args) {

    boolean result;
    int a = 3;
    int b = 6;

    result = 3 > 4; // FALSE
    System.out.println("3 > 4     " + result);

    result = 1 < 2; // TRUE
    System.out.println("1 < 2     " + result);

    result = -2 >= -6; // TRUE
    System.out.println("-2 >= -6  " + result);

    result = 12 <= 5; // FALSE
    System.out.println("12 <= 5   " + result);

    result = 2 == 2; // TRUE
    System.out.println("2 == 2    " + result);

    result = 1 != 2; // TRUE
    System.out.println("1 != 2    " + result);

    System.out.println("-------------");
    System.out.println("a: " + a);
    System.out.println("b: " + b);
    System.out.println("-------------");

    System.out.println("a > b   " + (a > b));
    System.out.println("a >= b  " + (a >= b));
    System.out.println("a < b   " + (a < b));
    System.out.println("a <= b  " + (a <= b));
    System.out.println("a == b  " + (a == b));
    System.out.println("a != b  " + (a != b));
  }
}
