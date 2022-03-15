/***************************************************************************************************
 * boolean operator
 *
 * Vergleich von TRUE oder FALSE und Wertebereichsvergleiche (a > b)
 * Können kombiniert werden
 *
 * && UND             (and)
 * || ODER            (or)
 * ^ Exklusives Oder  (xor)
 * ! Negation         (not)
 *
 ***************************************************************************************************/

public class BoolOperator {
  public static void main(String[] args) {

    boolean a = false;
    boolean b = true;

    System.out.println("a: " + a);
    System.out.println("b: " + b);
    System.out.println("-------------");

    System.out.println("a && b  " + (a && b));
    System.out.println("a || b  " + (a || b));
    System.out.println("a ^ b   " + (a ^ b));
    System.out.println("!a      " + (!a));
    System.out.println("!b      " + (!b));

    System.out.println("-------------");
    System.out.println("(a && b) ^ (a || b)  " + ((a && b) ^ (a || b)));
    System.out.println("(a || b) ^ (a || b)  " + ((a || b) ^ (a || b)));
    System.out.println("(a && b) ^ (a && b)  " + ((a && b) ^ (a && b)));

    System.out.println("-------------");
    System.out.println("(a && b) || (a || b)  " + ((a && b) || (a || b)));
    System.out.println("(a || b) || (a || b)  " + ((a || b) || (a || b)));
    System.out.println("(a && b) || (a && b)  " + ((a && b) || (a && b)));

    System.out.println("-------------");
    System.out.println("(a && b) && (a || b)  " + ((a && b) && (a || b)));
    System.out.println("(a || b) && (a || b)  " + ((a || b) && (a || b)));
    System.out.println("(a && b) && (a && b)  " + ((a && b) && (a && b)));
    System.out.println("(a && b) || (a && b)  " + ((a && b) || (a && b)));

    System.out.println("-------------");
    System.out.println("!(a && b) && (a || b)  " + (!(a && b) && (a || b)));
    System.out.println("!(a || b) && (a || b)  " + (!(a || b) && (a || b)));
    System.out.println("!(a && b) && (a && b)  " + (!(a && b) && (a && b)));

    System.out.println("-------------");
    System.out.println("(a && b) && (a || b)  " + ((a && b) && !(a || b)));
    System.out.println("(a || b) && (a || b)  " + ((a || b) && !(a || b)));
    System.out.println("(a && b) && (a && b)  " + ((a && b) && !(a && b)));

    System.out.println("-------------");
    System.out.println("(a && b) && (a || b)  " + (!(a && b) && !(a || b)));
    System.out.println("(a || b) && (a || b)  " + (!(a || b) && !(a || b)));
    System.out.println("(a && b) && (a && b)  " + (!(a && b) && !(a && b)));
  }
}
