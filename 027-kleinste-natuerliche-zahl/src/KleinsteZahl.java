public class KleinsteZahl {

  public static void main(String[] args) {
    int zahl = 0;
    boolean gefunden = false;

    endless: while (gefunden == false) {
      zahl++;

      for (int divisor = 1; divisor <= 10; divisor++) {
        if (zahl % divisor != 0) {
          continue endless;
        }
      }

      gefunden = true;
    }

    System.out.println("Die kleinste natürliche Zahl die durch 1-10 teilbar ist: " + zahl);
  }
}
