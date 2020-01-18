package datastructure;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> line = new LinkedList<>();
		line.add("first");
		line.add("second");
		line.add("third");
		line.add("fourth");
		line.add("fifth");

		System.out.println("Elements of Queue:\n"+line);
		System.out.println("Peek into elements:\n" + line.peek());
		System.out.println("Current Queue:\n"+line);
		System.out.println("Remove first element:\n" + line.remove());
		System.out.println("Current Queue:\n"+line);
		System.out.println("Poll element:\n" + line.poll());
		System.out.println("Current Queue:\n"+line);

		System.out.println("\nFor Each loop to Retrieve Data:\n");
		for (String a : line)
			System.out.println(a);

		System.out.println("\nWhile loop to Retrieve Data:\n");
		Iterator b = line.iterator();
		while (b.hasNext())
			System.out.println(b.next());
	}

}
