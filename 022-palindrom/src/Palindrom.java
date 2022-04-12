import java.util.Arrays;

public class Palindrom {
  public static void main(String[] args) {

    boolean isPalindrim = true;

    String word = "rotator";

    int wordLength = word.length() - 1;
    int loopLength = wordLength / 2;

    for (int i = 0; i < loopLength; i++) {
      char charBegin = word.charAt(i);
      char charEnd = word.charAt((wordLength - i));

      if(charBegin != charEnd){
        isPalindrim = false;
        break;
      }

    }

    System.out.println(isPalindrim);
  }
}
