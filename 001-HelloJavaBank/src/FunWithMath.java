/***************************************************************************************************
 * FunWithMath
 *
 * einfache mathematische Berechnungen
 *
 ***************************************************************************************************/
public class FunWithMath {
  public static void main(String[] args) {

    int meineZahl = 20; // wert ist 20
    int weitereZahl;    // kein wert

    meineZahl = meineZahl + 15; // 20 + 15 → Wert 35

    meineZahl--; // 35 - 1 = 34
    meineZahl++; // 34 + 1 = 35

    meineZahl = meineZahl / 7;  // 35 / 7 = 5
    meineZahl *= 2;             // 5 * 2 = 10

    weitereZahl = 2; // wert 2

    meineZahl = meineZahl - weitereZahl; // 10 - 2 = 8

    System.out.println(meineZahl); // 8
  }
}
