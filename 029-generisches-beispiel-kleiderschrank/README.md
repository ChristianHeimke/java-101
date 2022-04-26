# Generischer Kleiderschrank

## Aufgabe
Erstellen Sie einen virtuellen Kleiderschrank!

Dieser soll folgende Klassen beinhalten:
* Kleidung
* Hemd erweitert Kleidung
* Socken erweitert Kleidung
* Fach (generisch)
* Farbe (enum)
* Schrank, hat ein Fach für Socken und ein Fach für Hemden
* SchrankTest beinhaltet die main Funktion zum testen

### Klasse `Kleidung`
* Hat ein Attribut Größe (ganzzahlig)
* Hat ein Attribut Farbe (basierend auf dem Enum Farbe)

### Klasse `Hemd`
* Erweitert die Klasse Kleidung
* Hat einen Konstruktor der die Größe und Farbe übergibt / übernimmt beim anlegen des Objekts

### Klasse `Socken`
* Erweitert die Klasse Kleidung
* Hat einen Konstruktor der die Größe und Farbe übergibt / übernimmt beim anlegen des Objekts

### Enum `Farbe`
* Hat verschiedene (selbstwählbare) Farben
* Wird bei der Kleidung verwendet

### Klasse `Fach`
* Ist generisch
* Hat eine Liste (LinkedList) für den Inhalt des Fachs
* Hat folgende Funktionen:
  * `void einRaeumen(T element)`
    * fügt ein Element an die Liste an
  * `T ausRaeumen()`
    * Entfernt das letzte Element aus der Liste
  * `int anzahl()`
    * gibt die Anzahl der Elemente zurück
  * `boolean isEmpty()`
    * prüft ob das Fach leer ist

### Klasse `Schrank`
* hat ein `Fach` für `Socken`
* hat ein `Fach` für `Hemden`
* hat eine Funktion die die Gesamtanzahl der Kleidungsstücke zurückgibt

### Klasse `SchrankTest`
* hat eine wildcard funktion die überprüft ob es noch ein leeres Fach gibt
* hat die `main`-Funktion
  * legt einen Schrank an
  * legt ein paar Socken an
  * legt ein weiteres paar Socken an
  * räumt die Socken in das dafür vorgesehene Fach
  * prüft mit der wildcard funktion ob noch ein Fach leer ist
* Erstellen Sie ein schwarzes Hemd und versuchen Sie es in das Fach für Socken zu legen
