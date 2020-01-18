package datastructure;
import java.sql.SQLOutput;
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
		List<String> breakfast = new ArrayList<>();
		breakfast.add("Bread");
		breakfast.add("Egg");
		breakfast.add("Coffee");

		List<String> lunch = new ArrayList<>();
		lunch.add("Rice");
		lunch.add("Chicken");
		lunch.add("Vegetable");

		List<String> dinner = new ArrayList<>();
		dinner.add("Soup");
		dinner.add("Salad");
		dinner.add("Tea");

		Map<String, List<String>> map = new HashMap<String, List<String>>();
		map.put("Morning", breakfast);
		map.put("Afternoon", lunch);
		map.put("Night", dinner);

		System.out.println("For Each Loop Result: \n" + "--------------------------------------");
		for (Map.Entry item : map.entrySet()) {
			System.out.println(item.getKey() + " = " + item.getValue());
		}

		System.out.println("\n" + "While Loop with Iterator Result: \n" + "--------------------------------------");
		Iterator<Map.Entry<String, List<String>>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, List<String>> entry = iterator.next();
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}

	}
}
