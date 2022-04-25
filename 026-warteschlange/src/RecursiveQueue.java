public class RecursiveQueue implements Queue {
	private Node firstNode;
	private int size = 0;
	
	private class Node {
		Object element;
		Node next;
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
	public void enqueue(Object element) {
		final Node node = new Node();
		node.element = element;
		if(isEmpty()) {
			this.firstNode = node;
		} else {
			Node currentNode = this.firstNode;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = node;
		}
		this.size++;
	}

	@Override
	public Object dequeue() {
		if (!isEmpty()) {
			final Object element = this.firstNode.element;
			this.firstNode = this.firstNode.next;
			size--;
			return element;
		}
		return null;
	}
}
