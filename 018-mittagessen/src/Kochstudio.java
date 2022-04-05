
public class Kochstudio {
    public static void main(String[] args) {
        System.out.println("****  Herzlich Willkomen im Kochstudio  ****");

        // Objekte der Klasse Dönner können direkt über den Klassenkonstruktor erstellt
        // werden
        Döner döner = new Döner();
        döner.addZutat(/* DEFAULT */);

        // Objekte der Klasse Mahlzeit können nicht direkt instanziiert werden, weil die
        // Klasse abstract ist.
        // Es können nur Objekte von abgeleiten KLassen einem Mahlzeit-Objekt zugewiesen
        // werden.
        Mahlzeit kleinerDöner = new Döner();
        kleinerDöner.addZutat();

        // Objekte der übergeordneten Klasse Mahlzeit können Objekte der abgeleiteten
        // Klasse referenzieren
        // Die Klasse des tatsächlich verwendeten Objekts wird erst zur Laufzeit
        // ermittelt => dynamische Bindung
        Mahlzeit spaghetti = new Nudel();
        spaghetti.addZutat("Sosse", "Wasser", "Hackfleisch", "Pamesan");

        // Die Klasse Dönner implementiert das Interface IWare und kann daher auch als
        // Ware betrachtet werden.
        IWare ware = new Döner();
        ware.getPreis();

        for (String zutat : spaghetti.getZutaten()) {
            System.out.println(zutat);
        }
    }
}
