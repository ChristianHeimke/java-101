

public class ArrayNumberQueue<E extends Number> extends ArrayQueue<E> {
	public double sum() {
		double sum = 0.0;
		if (!isEmpty()) {
			for (int i = 0; i < size(); i++) {
				sum += ((Number) super.elements[i]).doubleValue();
			}
		}
		return sum;
	}
}
