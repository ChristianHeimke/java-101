import java.io.Console;

public class Auto {

    public static void main(String[] args) {

        Console cons = System.console();
        cons.printf("\n");

        float km;
        float liter;
        float ergebnis;

        while (true) {

            try {

                cons.printf("Berechnung von Verbrauch pro 100 km");
                cons.printf("\n");

                cons.printf("Geben Sie die gefahrenen km ein: ");
                km = (float) Integer.parseInt(cons.readLine());

                cons.printf("Geben sie die Liter an ");
                liter = (float) Integer.parseInt(cons.readLine());

                if (km == 0) {
                    throw new IllegalArgumentException();
                }

                ergebnis = liter / km * 100;

                cons.printf("\nGefahrene %f \nGetankte Liter: %f \nVerbrauch: %f\n", km, liter, ergebnis);

            } catch (NumberFormatException e) {
                System.out.println("Failed");
            } catch (IllegalArgumentException e1) {
                System.out.println("Bist du überhaupt gefahren?");
            } finally {
                System.out.println("Nocmal das ganze");
            }
        }
    }

}
