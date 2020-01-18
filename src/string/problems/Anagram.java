package string.problems;
import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        String word1 = "race";
        String word2 = "fish";

        if (word1.length() == word2.length()) {
            char[] array1 = word1.toCharArray();
            Arrays.sort(array1);
            char[] array2 = word2.toCharArray();
            Arrays.sort(array2);

            if (array1 == array2)
                System.out.println("The words "+word1+" and "+word2+" are Anagrams");
            else
                System.out.println("The words "+word1+" and "+word2+" are not Anagrams");

        }


    }
}



