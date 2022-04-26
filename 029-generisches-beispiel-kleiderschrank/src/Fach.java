import java.util.LinkedList;
import java.util.List;

public class Fach<T> {

  private List<T> inhalt = new LinkedList();

  void einRaeumen(T element) {
    this.inhalt.add(element);
  }

  T ausRaeumen() {
    return this.inhalt.get(this.inhalt.size());
  }

  int anzahl() {
    return this.inhalt.size();
  }

  void getType() {
    System.out.println(this.inhalt.getClass().getName());
  }

  List<T> getInhalt(){
    return this.inhalt;
  }

  boolean isEmpty(){
    return this.inhalt.size() == 0;
  }

}
