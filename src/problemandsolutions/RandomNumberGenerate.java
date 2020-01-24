
package problemandsolutions;

import java.util.Random;

public class RandomNumberGenerate {
    //Write Java program to generate a random number between 1 to 8.
    public static void main(String[] args) {
        Random rand = new Random();
        int highNum = 1209;
        int randnumb = rand.nextInt(highNum);
        System.out.println("Your Random # is: " + (randnumb+1));

    }
}