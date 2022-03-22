import java.util.Random;

public class MyUnsortedArray {

  public static void main(String[] args) {
    // int Array mit der Länge 10 anlegen
    int[] javaRandomNumbers = new int[10];
    int[] sortedNumbersUp = new int[10];

    Random rand = new Random();
    int maxElement = 0;
    int minElement = 50;

    // Array befüllen
    for (int idx = 0; idx < javaRandomNumbers.length; idx++) {
      javaRandomNumbers[idx] = rand.nextInt(50);
    }

    // Array Ausgeben:
    for (int idx = 0; idx < javaRandomNumbers.length; idx++) {
      System.out.println("Zufallszahl an Position #" + idx + ": " + javaRandomNumbers[idx]);
    }

    System.out.println("------------------------");

    // größtes element ermitteln
    for (int idx = 0; idx < javaRandomNumbers.length; idx++) {
      if (javaRandomNumbers[idx] > maxElement) {
        maxElement = javaRandomNumbers[idx];
      }

      if (javaRandomNumbers[idx] < minElement) {
        minElement = javaRandomNumbers[idx];
      }
    }
    System.out.println("Größte Zahl: " + maxElement);
    System.out.println("Kleinste Zahl: " + minElement);

    System.out.println("------------------------");

    // Array kopieren um das orginal nicht zuverändern
    System.arraycopy(javaRandomNumbers, 0, sortedNumbersUp, 0, javaRandomNumbers.length);

    boolean sortiert = false;

    bubbleSort:
    while (true) {
      for (int idx = 0; idx < sortedNumbersUp.length - 1; idx++) {
        if (sortedNumbersUp[idx] > sortedNumbersUp[idx + 1]) {

          // Positionstausch von aktuellem Element und dem nachfolgendem Element
          int idxValue = sortedNumbersUp[idx];
          int idxNextValue = sortedNumbersUp[idx+1];
          sortedNumbersUp[idx] = sortedNumbersUp[idx + 1];
          sortedNumbersUp[idx + 1] = idxValue;

          System.out.println("------ tausch von " + idxValue + " (pos " + idx +") und " + idxNextValue+ " (pos " + (idx + 1) + ")");
          continue bubbleSort;
        }

      }
      break bubbleSort;
    }

    for (int idx = 0; idx < sortedNumbersUp.length; idx++) {
      System.out.println("Sortiere an Position #" + idx + ": " + sortedNumbersUp[idx]);
    }

  }
}
