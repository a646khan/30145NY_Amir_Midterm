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
		int num = 2;
		int maxCheck = 1000000;
		boolean isPrime = true;
		String primeNumberFound = "";

		for(int i = 2; i <= maxCheck; i++)
		{
			isPrime = CheckPrime(i);
			if (isPrime)
			{
				primeNumberFound = primeNumberFound + i + " ";
			}
		}
		System.out.println("Prime numbers from 1 to 1,000,000 are: " + primeNumberFound);
	}
	public static boolean CheckPrime(int numCheck)
	{
		int remainder;
		for (int i = 2; i <= numCheck / 2; i++)
		{
			remainder = numCheck % i;
			if (remainder == 0)
			{
				return false;
			}
		}
		return true;
	}

}
