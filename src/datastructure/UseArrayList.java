package datastructure;
import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		List<String> myArray = new ArrayList<String>();
		myArray.add("Sleep");
		myArray.add("Eat");
		myArray.add("Play");
		myArray.add("Class");
		myArray.add("Work");

		System.out.println("Elements of ArrayList:\n"+myArray);
		System.out.println("Peek into first elements:\n" + myArray.get(0));
		System.out.println("Remove first element:\n" + myArray.remove(0));
		System.out.println("Retrieve Current Elements:\n"+myArray);

		System.out.println("\nFor Each loop to Retrieve Data:\n");
		for (String a : myArray)
			System.out.println(a);

		System.out.println("\nWhile loop to Retrieve Data:\n");
		Iterator b = myArray.iterator();
		while (b.hasNext())
			System.out.println(b.next());


	}

}
