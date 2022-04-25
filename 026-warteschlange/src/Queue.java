public interface Queue {
	boolean isEmpty();
	int size();
	void enqueue(Object element);
	Object dequeue();
}
