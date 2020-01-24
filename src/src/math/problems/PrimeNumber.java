package math.problems;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

		int count = 0;
		for (int i = 2; i < 1000000; i++) {

			boolean isDivisible = false;
			for (int j = 2; j < i / 2; j++)
				if (i % j == 0) {
					isDivisible = true;
					break;
				}

			if (!isDivisible)
				count++;
		}
		System.out.println("Number of prime number between 1 and 1 million is " + count);
	}

}
