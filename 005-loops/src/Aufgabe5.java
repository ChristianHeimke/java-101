public class Aufgabe5 {
  public static void main(String[] args) {
    // Aufgabe:
    // 1,3,6,10,15, ...
    // Dreieckszahlen
    // 1 = 1
    // 3 = 1 + 2
    // 6 = 1 + 2 + 3
    // 10 = 1 + 2 + 3 + 4
    // 15 = 1 + 2 + 3 + 4 + 5

    int result = 1;
    int counter = 1;

    while(true){
      result = (counter * (counter + 1)) / 2;

      if(result > 100){
        break;
      };

      for(int i = 1; i <= counter ; i++){
        if(i < counter){
          System.out.print(i + " + ");
        }else{
          System.out.print(i);
        }

      }
      System.out.println(" = " + result);
      counter++;
    };
  }
}