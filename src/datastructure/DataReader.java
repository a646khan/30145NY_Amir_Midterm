package datastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class.
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String textFile = "/Users/ahermassi/Documents/IdeaProjects/MidtermJuly2019/src/data/self-driving-car";
		Stack<String> stack = new Stack();
		LinkedList<String> linkedList = new LinkedList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(textFile))) {

			String line;
			while ((line = br.readLine()) != null) {
				for(String word: line.split(" ")) {
					stack.push(word);
					linkedList.add(word);
				}

			}

		} catch (IOException e) {
			System.err.format("IOException: %s%n", e);
		}

		System.out.println("First word pushed: " + stack.firstElement());
		System.out.println("Last word pushed: " + stack.peek());

		System.out.println("\nThe original file content using For Each:");
		for(String word: stack)
			System.out.print(word + " ");

		System.out.println("\n\nThe original file content using iterator:");
		Iterator<String> iterator = linkedList.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next() + " ");
		}
	}

}
