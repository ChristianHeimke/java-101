/*

  Geben Sie auf der Konsole jede zweite Zahl von 0 bis 100 aus (beginnend mit 0).

*/
public class Aufgabe4While {

  public static void main(String[] args) {

    int i = 0;

    while(i <= 100){
      System.out.println(i);

      //    i += 2 ist Äquivalent zu
      //    i = i + 2
      i += 2;
    }

  }
}
