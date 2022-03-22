import java.util.Random;

public class MyThirdArray {

  public static void main(String[] args) {
    int[] javaRandomNumbers = new int[10];
    Random rand = new Random();

    // Array befüllen
    for (int idx = 0; idx < javaRandomNumbers.length; idx++) {
      javaRandomNumbers[idx] = rand.nextInt(50);
    }

    // Array Ausgeben:
    for (int idx = 0; idx < javaRandomNumbers.length; idx++) {
      System.out.println("Zufallszahl an Position #" + idx + ": " + javaRandomNumbers[idx]);
    }

    System.out.println("------------------------");

    // Alternative
    for (int arrElement : javaRandomNumbers) {
      System.out.println("Zufallszahl: " + arrElement);
    }

    System.out.println("------------------------");

    // Zufälliges Element
    System.out.println("Zufallselement: " + javaRandomNumbers[rand.nextInt(javaRandomNumbers.length)]);
  }
}
