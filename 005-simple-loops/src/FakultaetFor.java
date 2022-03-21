/*

  Berechnen Sie die Fakultätder Variable n mithilfe einer Schleife Ihrer Wahl.

*/
public class FakultaetFor {

  public static void main(String[] args) {

    int n = 3;
    int result = 1;

    for (int i = 1; i <= n; i++) {
      result = result * i;
    }
    System.out.println("Die Fakultaet von " + n + " ist: " + result);
  }
}
