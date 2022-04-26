// Kleiderschrank mit verschiedenen Fächern, die Spezialisiert werden anhand des Kleidungsstücks
class Schrank {

  Fach<Socken> fachSocken = new Fach<>();
  Fach<Hemd> fachHemden = new Fach<>();

  Schrank() {
  }

  // gibt alle eingelagerten Kleidungsstücke zurück
  int anzahlKleidung(){
    return this.fachHemden.anzahl() + this.fachSocken.anzahl();
  }

}