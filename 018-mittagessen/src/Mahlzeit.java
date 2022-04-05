import java.util.ArrayList;
import java.util.List;

//Eine abstrakte Klasse. Diese KANN NICHT instanziiert (=> Es können keine Objekte mit
//dem new-Operator erstellt werden) werden.
public abstract class Mahlzeit {
    String Name;
    List <String> Zutaten = new ArrayList<>();

    Mahlzeit (){
        this.Name = "Default";
    }
    public void setName(String speise){
        this.Name = speise;
    }

    public String getname(){
        return this.Name;
    }

    public List <String> getZutaten(){
       return this.Zutaten;
    }

    // 1. Methodenüberladung: Methoden mit dem selben Namen ABER unterschiedlicher Methodensignatur
    // 2. Diese Methoden sind abstrakt. Sie wurden deklariert (=> Der Name und die Signatur
    // wurde dem Compiler bekannt gegeben) Aber sie wurden nicht definiert. Die Definition also das
    // Ausformulieren der tatsächlichen Funkionalität der Methoden MUSS in den abgeleiteten Klassen erfolgen
    public abstract void addZutat();
    public abstract void addZutat(String zutat);
    public abstract void addZutat(String ... zutaten);

}

// Ein Klasse "Döner", die alle Eigenschaften der Übergeordneten Klasse "Mahlzeit" erbt und die
// abstrakten Methoden definieren muss. Außerdem wird das Interface IWare implementiert. Dadurch
// kann die Klasse Döner auch als "Ware" verwendet werden. Wie bei abstrakten Methoden muss die
// Klasse Dönner alle Methoden des Interface IWare implementieren.
class Döner extends Mahlzeit implements IWare{

    // Definition der Abstrakten Methode aus der übergeordneten Klasse
    // Die Anmerkung (=> Annotation) @Override zeigt an, dass die Methode eine Methode aus einer
    // übergeordeten Klsase ODER einem Interfaces überschreibt bzw. neu definiert.
    @Override
    public void addZutat() {
        this.Zutaten.add("Brot");
        this.Zutaten.add("Fleisch");
        this.Zutaten.add("Salat");

    }

    //Deinition der Abstrakten Methode aus der übergeordneten Klasse
    @Override
    public void addZutat(String zutat) {
        this.Zutaten.add(zutat);
    }



    @Override
    public void addZutat(String... zutaten) {


    }

    //Deinition der aus dem Interface IWare geerbten Methode getPreis
    @Override
    public int getPreis() {
        // TODO Auto-generated method stub
        return 5;
    }

}

//Jede Klasse kann Elternklasse einer anderen sein.
//Einzige Bedingung: Eine Klasse kann IMMER nur von einer Klasse abgeleitet sein
//ABER beliebig viele Interfaces implementieren.
class dönerbox extends Döner{
    @Override
    public int getPreis() {
        // TODO Auto-generated method stub
        return 8;
    }

}

class Nudel extends Mahlzeit{

    @Override
    public void addZutat(String zutat) {
        this.Zutaten.add("sosse" + zutat);
    }

    @Override
    public void addZutat() {
        // TODO Auto-generated method stub

    }

    @Override
    public void addZutat(String... zutaten) {
        for (String s : zutaten) {
            this.Zutaten.add(s);

        }

    }

}