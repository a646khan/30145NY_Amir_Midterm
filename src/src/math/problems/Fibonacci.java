package math.problems;

public class Fibonacci {

    public static int Fib(int n) {

        if (n <= 1)
            return n;
        return Fib(n - 1) + Fib(n - 2);
    }

    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */

        for (int i = 0; i < 40; i++) {
            System.out.print(Fib(i) + ", ");
        }
    }
}
