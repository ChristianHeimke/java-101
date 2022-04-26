public interface Queue<E> {
	boolean isEmpty();
	int size();
	void enqueue(E element);
	E dequeue();
}
