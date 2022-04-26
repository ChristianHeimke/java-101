public class RecursiveQueue<E> implements Queue<E> {
	protected Node<E> firstNode;
	private int size = 0;
	
	protected class Node<T> {
		T element;
		Node<T> next;
	}

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
		final Node<E> node = new Node<>();
		node.element = element;
		if(isEmpty()) {
			this.firstNode = node;
		} else {
			Node<E> currentNode = this.firstNode;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = node;
		}
		this.size++;
	}

	@Override
	public E dequeue() {
		if (!isEmpty()) {
			final E element = this.firstNode.element;
			this.firstNode = this.firstNode.next;
			size--;
			return element;
		}
		return null;
	}
}
