class Schrank {

  Fach<Socken> fachSocken = new Fach<>();
  Fach<Hemd> fachHemden = new Fach<>();

  Schrank() {
  }

  int anzahlKleidung(){
    return this.fachHemden.anzahl() + this.fachSocken.anzahl();
  }

}