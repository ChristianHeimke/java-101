public class MathBasicTogther {
  public static void main(String[] args) {
    int zahl1 = 3;
    int zahl2 = 8;

    int ergebnisAddition = add(zahl1, zahl2);
    boolean vergleichZahlen = vergleichZahl1kleinerZahl2(zahl1, zahl2);

    System.out.println("Ergebnis addition: " + ergebnisAddition);

    if(vergleichZahlen){
      System.out.println("Die Zahl " + zahl1 + " ist kleiner als Zahl " + zahl2);
    }else{
      System.out.println("Die Zahl " + zahl1 + " ist NICHT kleiner als Zahl " + zahl2);
    }
  }

  // zahl addieren
  public static int add(int zahl1, int zahl2){
    return zahl1 + zahl2;
  }

  // zahl1 mit zahl2 vergleich
  // ist zahl1 kleiner als zahl2
  public static boolean vergleichZahl1kleinerZahl2(int zahl1, int zahl2){
    return (zahl1 < zahl2);
  }
}