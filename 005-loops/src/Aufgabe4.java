public class Aufgabe4 {
  public static void main(String[] args) {
    // Aufgabe: Zahlenreihe ausgeben:
    // Zahlenreihe: 1,2,4,8, ...
    // -> Binärzahlen

    int result = 1;

    for (int i = 0; i <= 10; i++) {
      System.out.println(result);
      result *= 2; // alternative Schreibweise:result = result * 2
    } ;
  }
}