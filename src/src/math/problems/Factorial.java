package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static int factorialRecursive(int n) {

        if( n == 1)
            return 1;
        return n * factorialRecursive(n - 1);
    }

    public static int factorialIterative(int n) {

        int prod = 1;
        for(int i = 1; i <= n; i++)
            prod *= i;
        return prod;
    }

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        int n = 5;
        System.out.println(factorialRecursive(n));
        System.out.println(factorialIterative(n));

    }
}
