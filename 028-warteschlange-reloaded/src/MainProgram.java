
public class MainProgram {

	public static void main(String[] args) {

		// Queue q1 = new Queue();
		// q1.enqueue("haus");
		// q1.enqueue(1);
		// q1.enqueue("garten1");
		// System.out.println(q1);
		// q1.enqueue("garten1");
		// q1.enqueue("garten1");
		// q1.enqueue("garten2");
		// System.out.println(q1);

		RecursiveQueue q2 = new RecursiveQueue();
		q2.enqueue("Haus");
		q2.enqueue("Haus2");
		Object element = q2.dequeue();
		Object element2 = q2.dequeue();
		System.out.println(element);
		System.out.println(element2);
	}

}
