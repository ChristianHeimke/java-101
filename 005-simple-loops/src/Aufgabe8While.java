/*

    Geben Sie auf der Konsole folgendes aus:

    *
    **
    ***
    ****
    *****
    ******
    *******
    ********
    *********

*/
public class Aufgabe8While {

	public static void main(String[] args) {

    int i = 0;
    int j = 0;

    // äußere schleife
    while(i < 10){

      // innere schleife
      while(j < i){
        System.out.print("*");
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
