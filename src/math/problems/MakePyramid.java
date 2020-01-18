package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *

         */
        int n = 5;
        printStars(5);

    }

    public static void printStars(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                System.out.println(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.println("* ");
            }
            System.out.println();

        }
    }
}

