class AktienVerySimple {
  public static void main(String[] args) {
    // Startgeld
    int startGeld = 20;
    /*
      0 → startwert   = 20
      1 → Januar      = 20 * 2  = 40
      2 → Februar     = 40 * 2  = 80
      3 → März        = 80 * 2  = 160
      4 → April       = 160 * 2 = 320
      5 → Mai         = 320 * 2 = 640
    */

    int[] aktienDepot = new int[6];
    aktienDepot[0] = startGeld;

    for(int i = 1; i < aktienDepot.length; i++){
      if(i == 0){
        // start wert
        aktienDepot[i] = startGeld;
      }else{
        // wert zum vorhergehenden Wert verdoppeln
        aktienDepot[i] = aktienDepot[i - 1] * 2;
      }
    }

    System.out.println("Zu Beginn hatte ich " + aktienDepot[0] + " Euro, am 01.05. habe ich " + aktienDepot[aktienDepot.length-1] + " Euro");

    // Ausgabe aller Elemente
    for(int elem : aktienDepot){
      System.out.println(elem);
    }
  }
}