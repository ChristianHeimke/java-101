/*

    Geben Sie auf der Konsole folgendes aus:

    1
    12
    123
    1234
    12345
    123456
    1234567
    12345678
    123456789

*/
public class Aufgabe7WhileLoop {

	public static void main(String[] args) {

    int i = 1;
    int j = 0;

    // äußere schleife
    while(i < 10){

      // innere schleife
      while(j < i){
        System.out.print(j);
        j++;
      }

      // Zeilenumbruch
      System.out.println("");

      // inneren Schleifenzähler zurücksetzen nach jedem durchlauf
      j = 0;
      i++;
    }

  }
}
