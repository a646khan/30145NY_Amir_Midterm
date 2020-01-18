package string.problems;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/**
 */
public class DuplicateWord {

    public static void main(String[] args) {


        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        List<String> list = Arrays.asList(st.split(" "));

        Set<String> uniqueWords = new HashSet<String>(list);
        for (String word : uniqueWords) {
            System.out.println(word + ": " + Collections.frequency(list, word));

        }

    }
}
