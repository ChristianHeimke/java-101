
public class RecursiveNumberQueue<E extends Number> extends RecursiveQueue<E> {
	public double sum() {
		double sum = 0.0;
		if (!isEmpty()) {
			Node<E> currentNode = super.firstNode;
			do {
				sum += currentNode.element.doubleValue();
				currentNode = currentNode.next;
			} while (currentNode != null);
		}
		return sum;
	}
}
