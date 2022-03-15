/***************************************************************************************************
        Hello Java Bank

        Praktisches Beispiel für:
        * Variablen Deklaration und Initalisierung
        * Typen Umwandlung
        * statische Variablen (Konstanten)
        * Mathematische Operationen
        * Mathematische Operationen in kurzschreibweise
        * Ausgabeformatierung

        Ausgabe:
        Unser Ausgaben sind: 386.11
        Unser Kontostand beträgt jetzt gerundet: 614
        Unser Tagesbuged: 20
        Unser Kontostand komplett: 614.89Euro

***************************************************************************************************/
public class HelloJavaBank {
    public static void main(String[] args) {

        // Ausgangsszenario
        double kontostand = 0.0;
        System.out.println("Kontostand nach Kontoeröffnung: " + kontostand);

        // konstante tage im Monat
        final int tage_im_monat = 30;

        // Einnahmen (ohne Währung)
        int gehalt = 1000;

        // Ausgaben (ohne Währung)
        int supermarkt_einkauf = 86;    // ganzzahliger Einkauf
        int tanken = 300;               // ganzzahliger Einkauf
        double kaugummi = 0.11;         // Kaugummis sind cent artikel :)

        // Gesamtausgaben berechnen
        // wichtig: double als Typ, da wir einen double wert bei den Ausgaben haben
        double gesamt_ausgaben =  supermarkt_einkauf + tanken + kaugummi;
        System.out.println("Unser Ausgaben sind: " + gesamt_ausgaben);

        // Kontostand berechnen:
        // gehalt wird eingezahlt
        // ausagaben werden abgezogen
        kontostand += gehalt;           // Äquivalent: kontostand = kontostand + gehalt;
        kontostand -= gesamt_ausgaben;  // Äquivalent: kontostand = kontostand - gesamt_ausgaben;

        // zinsen sind ein euro
        kontostand++; // Äquivalent: kontostand = kontostand + 1

        System.out.println("Unser Kontostand beträgt jetzt gerundet: " + (int)kontostand);  // Typenumwandlng ohne den Wert in die Variable zu übernehmen
                                                                                            // sondern nur auszugeben
        System.out.println("Unser Tagesbudget: " + (int)(kontostand / tage_im_monat));       // aktuellen kontostand dividiert durch die Anzahl der Tage
                                                                                            // im Monat und einfach gerundet (abgeschnitten nach dem Komma)
        System.out.println("Unser Kontostand komplett: " + kontostand + "Euro");            // Kontostand mit Währung
    }
}
