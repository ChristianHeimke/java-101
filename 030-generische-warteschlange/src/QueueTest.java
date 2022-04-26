public class QueueTest {

	public static void main(String[] args) {

		ArrayNumberQueue<Integer> testFuerMax = new ArrayNumberQueue<>();
		testFuerMax.enqueue(19);
		testFuerMax.enqueue(20);

		System.out.println(testFuerMax.sum());


		// RecursiveNumberQueue<Integer> recursiveNumberQueue = new RecursiveNumberQueue<>();
		// recursiveNumberQueue.enqueue(2);
		// recursiveNumberQueue.enqueue(10);
		// recursiveNumberQueue.enqueue(8);
		// recursiveNumberQueue.enqueue(-10);
		// recursiveNumberQueue.enqueue(20);
		// recursiveNumberQueue.enqueue(20);
		// recursiveNumberQueue.enqueue(20);
		// double sum  = recursiveNumberQueue.sum();
		// System.out.println(sum);

		// ArrayNumberQueue<Integer> arrayNumberQueue = new ArrayNumberQueue<>();
		// arrayNumberQueue.enqueue(2);
		// arrayNumberQueue.enqueue(10);
		// arrayNumberQueue.enqueue(8);
		// arrayNumberQueue.enqueue(-10);
		// arrayNumberQueue.enqueue(20);
		// arrayNumberQueue.enqueue(20);
		// arrayNumberQueue.enqueue(20);
		// sum = arrayNumberQueue.sum();
		// System.out.println(sum);
	}
}
