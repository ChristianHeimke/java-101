/*

  Endlosschleife

*/
public class CountAsterisk {

  public static void main(String[] args) {

    int i,j;
    int count = 0;

    for(i = 0; i < 5; i++){
      for (j = 0; j < i; j++){
        System.out.println("*");
        count++;
      }
    }

    System.out.println("");
    System.out.println("Der * wurde " + count + " mal ausgegeben");

  }
}
