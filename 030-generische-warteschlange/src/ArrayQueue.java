public class ArrayQueue<E> implements Queue<E> {
	public static final int INITIAL_QUEUE_SIZE = 32;

	protected Object[] elements = new Object[INITIAL_QUEUE_SIZE];
	private int size = 0;

	@Override
	public boolean isEmpty() {
		return this.size == 0;
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public void enqueue(E element) {
		ensureCapacity();
		this.elements[this.size++] = element;
	}

	@SuppressWarnings("unchecked")
	@Override
	public E dequeue() {
		if (!isEmpty()) {
			final E element = (E) this.elements[0];
			System.arraycopy(this.elements, 1, this.elements, 0, this.elements.length - 1);
			this.size--;
			return element;
		}
		return null;
	}


	private void ensureCapacity() {
		if (this.size == this.elements.length) {
			final Object[] newElementArray = new Object[2 * this.elements.length];
			System.arraycopy(this.elements, 0, newElementArray, 0, this.elements.length);
			this.elements = newElementArray;
		}
	}

}
