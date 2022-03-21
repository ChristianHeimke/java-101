/*

  Berechnen Sie die Fakultätder Variable n mithilfe einer Schleife Ihrer Wahl.

*/
public class FakultaetWhile {

  public static void main(String[] args) {

    int n = 3;
    int i = 1;
    int result = 1;

    while(i <= n){
      result = result * i;
      i++;
    }
    System.out.println("Die Fakultaet von " + n + " ist: " + result);
  }
}
