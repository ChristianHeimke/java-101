public class MeineMediathek {

  public static void main(String[] args) {
    Buch buch1 = new Buch("Java ist keine Insel", "nobody");
    Buch buch2 = new Buch("Clean Code", "anybody", 50);
    Buch buch3 = new Buch("Domain Driven Design", "everybody", 1);

    CD cd1 = new CD("lofi programming music", "unknown");
    CD cd2 = new CD("breaking code session vol 1", "anonymous");
    CD cd3 = new CD("I've got a magic stream", "Mr. Incredible");

    Mediathek meineMediathek = new Mediathek(2);

    meineMediathek.aufnehmen(buch1);
    System.out.println("Anzahl eingelagerter Bücher: " + meineMediathek.getInstanzenBuch());
    meineMediathek.aufnehmen(buch2);
    System.out.println("Anzahl eingelagerter Bücher: " + meineMediathek.getInstanzenBuch());
    meineMediathek.aufnehmen(buch3);
    System.out.println("Anzahl eingelagerter Bücher: " + meineMediathek.getInstanzenBuch());

    meineMediathek.aufnehmen(cd1);
    System.out.println("Anzahl eingelagerter CDs: " + meineMediathek.getInstanzenCD());
    meineMediathek.aufnehmen(cd2);
    System.out.println("Anzahl eingelagerter CDs: " + meineMediathek.getInstanzenCD());
    meineMediathek.aufnehmen(cd3);
    System.out.println("Anzahl eingelagerter CDs: " + meineMediathek.getInstanzenCD());

  }
}
