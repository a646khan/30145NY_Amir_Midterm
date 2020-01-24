package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		Map<String, List<String>> palindromes = new HashMap<>();
		palindromes.put("a", Arrays.asList("A nut for a jar of tuna", "Avid diva"));
		palindromes.put("b", Arrays.asList("Borrow or rob", "Bombard a drab mob"));
		palindromes.put("c", Arrays.asList("civic", "Cigar? Toss it in a can. It is so tragic"));
		palindromes.put("d", Arrays.asList("detartrated", "Did Hannah see bees? Hannah did"));
		palindromes.put("e", Arrays.asList("Eva, can I stab bats in a cave", "Evil, a sin, is alive"));

		System.out.println("The Map items by using iterator interface:");

		Iterator it = palindromes.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry)it.next();
			System.out.println(pair.getKey() + " palindromes: " + pair.getValue());
		}

		System.out.println("\nThe Map items by using For Each:");
		for(String key: palindromes.keySet()) {
			System.out.println(key + " palindromes: ");
			for(String item: palindromes.get(key))
				System.out.println(item);
			System.out.println();
		}


	}

}
