public class MeineMediathek {

  public static void main(String[] args) {
    // Beispiel Bücher
    Buch buch1 = new Buch("Java ist keine Insel", "nobody");
    Buch buch2 = new Buch("Clean Code", "anybody", 50);
    Buch buch3 = new Buch("Domain Driven Design", "everybody", 1);

    // Beispiel CDs
    CD cd1 = new CD("lofi programming music", "unknown");
    CD cd2 = new CD("breaking code session vol 1", "anonymous");
    CD cd3 = new CD("I've got a magic stream", "Mr. Incredible");

    // Mediathek anlegen
    Mediathek meineMediathek = new Mediathek();

    // Mediathek befüllen und Anzahl der Elemente ausgeben
    meineMediathek.aufnehmen(buch1);
    System.out.println("Elemente in der Mediathek: " + meineMediathek.getInstanzenAlle());
    meineMediathek.aufnehmen(buch2);
    System.out.println("Elemente in der Mediathek: " + meineMediathek.getInstanzenAlle());
    meineMediathek.aufnehmen(buch3);
    System.out.println("Elemente in der Mediathek: " + meineMediathek.getInstanzenAlle());
    meineMediathek.aufnehmen(cd1);
    System.out.println("Elemente in der Mediathek: " + meineMediathek.getInstanzenAlle());
    meineMediathek.aufnehmen(cd2);
    System.out.println("Elemente in der Mediathek: " + meineMediathek.getInstanzenAlle());
    meineMediathek.aufnehmen(cd3);
    System.out.println("Elemente in der Mediathek: " + meineMediathek.getInstanzenAlle());

    System.out.println();
    System.out.println();

    // komplette Mediathek ausgeben
    System.out.println(meineMediathek);
  }
}
