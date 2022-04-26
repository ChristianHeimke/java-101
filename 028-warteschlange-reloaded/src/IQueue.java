public interface IQueue {

	// 4 Methoden, die unsere Datenstruktur am Ende implementieren soll

	boolean isEmpty();

	int size(); // Aktuelle Größe der Queue (Wie viele Elemente sind in der Queue)

	void enqueue(Object element); // Objekt in Queue hinzufügen

	Object dequeue();// Objekt entfernen
}

// [1] [50] [80] [20] null
// dequeue -> [50] [80] [20] null null