package de.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zahlenspiel {
  public static void main(String[] args) {

    // Liste erstellen
    List<Integer> liste = new ArrayList<Integer>();

    // scanner definieren
    Scanner scanner = new Scanner(System.in);

    // Begrüßung anzeigen
    showHello();

    // für die Endlosschleife
    boolean keepProgramRunning = true;

    // solange die Eingabe nicht "exit" war, bleibt das Programm aktib
    while(keepProgramRunning){
      System.out.print("\nIhre Eingabe: ");
      // Eingabe vom Scanner holen
      String eingabe = scanner.nextLine();

      // Basierend auf der Eingabe reagieren
      switch(eingabe){
        // Programm beenden
        case "exit":
          keepProgramRunning = false;
          System.out.println("Bye Bye!");
          break;
        // alle Zahlen anzeigen
        case "print":
          showNumbers(liste);
          break;
        // standardmäßig die eingabe verarbeiten
        default:
          // komma getrennte eingabe splitten
          String[] numbers = eingabe.split(",");
          try{
            // für jedes element versuchen den Integerwert zu bilden
            // und an die Liste hängen
            for(String num : numbers){
              int number = Integer.parseInt(num);
              liste.add(number);
            }
          }
          catch (NumberFormatException ex){
            // nicht integerwerte werden verworfen
            System.out.println("Die Eingabe war ungültig!");
          }

      }

    }
  }

  // Start zeigen
  private static void showHello(){
    System.out.println("**********************************");
    System.out.println("* Geben Sie Zahlen mit einem Komma getrennt ein!");
    System.out.println("* Geben Sie print ein um die Zahlen auszugeben");
    System.out.println("* Geben Sie exit ein um das Programm zu beenden");
    System.out.println("**********************************");
  }

  // Zahlen alle ausgeben
  private static void showNumbers(List<Integer> liste){
    for(int i=0; i < liste.size(); i++ ){
      System.out.print(liste.get(i));

      if(i == (liste.size() - 1)){
        System.out.println(""); // am Ende einen Zeilenumbruch anzeigen
      }else{
        System.out.print(", "); // sonst immer ein komma
      }
    }
  }
}
