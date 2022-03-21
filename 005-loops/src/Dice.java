import java.util.Random;

public class Dice {
  public static void main(String[] args) {
    // 10 x Würfeln
    // Ergebnis zu Gesamtergebnis addieren

    int result = 0;
    Random rand = new Random();

    for(int i = 0; i < 10; i++){
      int rnd_result = rand.nextInt(6) + 1;
      result += rnd_result;

      System.out.println("Wurf: " + rnd_result + " Gesamtergebnis: " + result);
    }
  }
}