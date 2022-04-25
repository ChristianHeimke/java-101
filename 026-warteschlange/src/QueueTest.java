public class QueueTest {
	
	public static void main(String[] args) {
		Queue arrayQueue = new ArrayQueue();
		arrayQueue.isEmpty();
		arrayQueue.enqueue("Hallo");
		arrayQueue.enqueue("Java");
		arrayQueue.size();
		arrayQueue.dequeue();
		arrayQueue.dequeue();
		arrayQueue.dequeue();
		Queue recursiveQueue = new RecursiveQueue();
		recursiveQueue.enqueue("Hallo");
		recursiveQueue.enqueue("Java");
		recursiveQueue.size();
		recursiveQueue.dequeue();
		recursiveQueue.dequeue();
		recursiveQueue.dequeue();
	}
}
