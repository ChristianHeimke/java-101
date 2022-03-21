
public class Tree {
  public static void main(String[] args) {
    // Figuren Zeichnen

    int x = 6;
    int y = 2;

    /*
        **
        **
        **
        **
        **
        **
    */
    for(int i = 0; i < x; i++){
      for(int j = 0; j < y; j++){
        System.out.print("*");
      }
      System.out.println("");
    }
    System.out.println("");

    /*
        ******
        ******
    */
    for(int i = 0; i < y; i++){
      for(int j = 0; j < x; j++){
        System.out.print("*");
      }
      System.out.println("");
    }
    System.out.println("");

    /*
      *
      **
      ***
      ****
      *****
      ******
    */
    int max_up = (x > y) ? x : y;

    for(int i = 0; i <= max_up; i++){
      for(int j = 0; j < i; j++){
        System.out.print("*");
      }
      System.out.println("");
    }
    System.out.println("");

    /*
      ******
      *****
      ****
      ***
      **
      *
    */
    int max_down = (x > y) ? x : y;

    for(int i = max_down; i >= 0; i--){
      for(int j = 0; j < i; j++){
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}