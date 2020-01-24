package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */

		ArrayList<Integer> exampleArrayList = new ArrayList<>(2);

		exampleArrayList.add(5);
		exampleArrayList.add(10);
		exampleArrayList.add(20);
		exampleArrayList.add(40);
		exampleArrayList.add(80);

		// Retrieving data using For Each

		System.out.println("The ArrayList items by using For Each:");
		for(Integer item: exampleArrayList)
			System.out.println(item);

		// Retrieving data using iterator

		System.out.println("The ArrayList items by using iterator interface:");

		Iterator iterator = exampleArrayList.iterator();

		while(iterator.hasNext())
			System.out.println(iterator.next());

		exampleArrayList.remove(Integer.valueOf(40));
		System.out.println("Removed 40. Now the ArrayList content is:");
		for(Integer item: exampleArrayList)
			System.out.println(item);

		System.out.println("Retrieving element at index 2: " + exampleArrayList.get(2));
	}

}