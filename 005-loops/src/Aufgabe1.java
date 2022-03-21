public class Aufgabe1 {
  public static void main(String[] args) {
    // Aufgabe: Zahlenreihe ausgeben:
    // Zahlenreihe: 0,1,2,3,...,10

    for(int i = 0; i <= 10; i++){
      if(i < 10){
        System.out.print(i + ",");
      }else{
        System.out.println(i);
      }
    }
  }
}