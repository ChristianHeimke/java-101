public class Aufgabe2 {
  public static void main(String[] args) {
    // Aufgabe: Zahlenreihe ausgeben:
    // Hinweis: auf das Vorzeichen achten!
    // Zahlenreihe:  -10, -8, -6, ..., +10

    String vorzeichen = "";

    for(int i = -10; i <= 10; i++){

      // Vorzeichen setzen wenn man größer 0 ist
      if(i > 0){
        vorzeichen = "+";
      }

      if(i < 10){
        System.out.print(vorzeichen + i + ", ");
      }else{
        System.out.println(vorzeichen + i);
      }
    }
  }
}