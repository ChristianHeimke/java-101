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
public class Aufgabe7ForSimple {

  public static void main(String[] args) {

    String result = "";

    for(int i = 1; i < 10; i++){
      result += String.valueOf(i);

      System.out.println(result);
    }


  }
}
