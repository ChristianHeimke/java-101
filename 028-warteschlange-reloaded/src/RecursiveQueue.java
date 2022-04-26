
public class RecursiveQueue implements IQueue {

	private class Node {

		Object element;
		Node next;

	}

	int index = 0;
	Node firstNode;

	@Override
	public boolean isEmpty() {

		return this.index == 0;
	}

	@Override
	public int size() {

		return this.index;
	}

	@Override
	public void enqueue(Object element) {
		Node node = new Node();
		node.element = element;
		if (isEmpty()) {
			this.firstNode = node;
		} else {
			Node currentNode = this.firstNode;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = node;

		}
		this.index++;

	}

	@Override
	public Object dequeue() {
		if (!isEmpty()) {
			Object element = this.firstNode.element;
			this.firstNode = this.firstNode.next;
			this.index--;
			return element;
		}
		return null;
	}

}
