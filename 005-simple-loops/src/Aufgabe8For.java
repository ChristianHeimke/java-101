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
public class Aufgabe8For {
	public static void main(String[] args) {

		for(int i = 0; i < 10; i++){
      for(int j = 0; j < i; j++){
        System.out.print("*");
      }
      // Zeilenumbruch
      System.out.println("");
    }


  }
}
