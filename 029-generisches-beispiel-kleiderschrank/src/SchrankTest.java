public class SchrankTest {
  public static void main(String[] args) {
    Schrank schrank = new Schrank();

    Socken schwarzeSocken = new Socken(44, Farbe.SCHWARZ);
    Socken roteSocken = new Socken(44, Farbe.ROT);

    Hemd schwarzesHemd = new Hemd(32, Farbe.SCHWARZ);

    schrank.fachSocken.einRaeumen(schwarzeSocken);
    schrank.fachSocken.einRaeumen(roteSocken);
    // schrank.fachSocken.einRaeumen(schwarzesHemd);

    System.out.println(schrank.fachSocken.anzahl());

    System.out.println(leeresFach(schrank.fachHemden, schrank.fachSocken));


  }

  public static boolean leeresFach(Fach<?>... faecher) {
    for (Fach<?> fach : faecher) {
      if (fach.isEmpty()) {
        return true;
      }
    }

    return false;
  }
}
