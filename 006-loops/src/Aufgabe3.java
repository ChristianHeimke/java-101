public class Aufgabe3 {
  public static void main(String[] args) {
    // Aufgabe: Zahlenreihe ausgeben:
    // Zahlenreihe: 0,1,4,9
    // -> Quadratzahlen
    // 0^2 , 1^2, 2^2, 3^2, 4^2

    for(int i = 0; i <= 10; i++){
      int result = i * i;

      if(i < 10){
        System.out.print(result + ", ");
      }else{
        System.out.println(result);
      }
    }
  }
}