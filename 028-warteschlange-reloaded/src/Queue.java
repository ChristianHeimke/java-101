
import java.util.Arrays;

public class Queue implements IQueue {

	// Variablen der Klasse Queue
	Object[] arrayIntern;
	int index;

	// Konstruktor
	public Queue() {
		this.index = 0;
		this.arrayIntern = new Object[5];
	}

	@Override
	public String toString() {
		return "Queue [arrayIntern=" + Arrays.toString(arrayIntern) + ", index=" + index + "]";
	}

	@Override
	public boolean isEmpty() {

		return this.index == 0;
	}

	@Override
	public int size() {
		return this.index;
	}

	// Objekt aufnehmen
	@Override
	public void enqueue(Object element) {
		if (arrayIntern.length == index) { // 5==
			System.out.println("Queue is full!!");
		} else {
			this.arrayIntern[index] = element;
			index++;
		}

	}

	@Override
	public Object dequeue() {
		if (!isEmpty()) {
			Object element = this.arrayIntern[0];
			System.arraycopy(this.arrayIntern, 1, this.arrayIntern, 0, this.arrayIntern.length - 1);
			this.index--;
			return element;
		}
		return null;
	}

}
