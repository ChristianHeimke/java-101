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
public class Aufgabe7WhileSimple {

  public static void main(String[] args) {

    String result = "";
    int i = 1;

    while(i < 10){
      result += String.valueOf(i);
      System.out.println(result);

      i++;
    }

  }
}
