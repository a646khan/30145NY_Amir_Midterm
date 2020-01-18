package string.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement
        String [] array = s.split(" ");
        String longestWord = " ";
        for ( int i = 0; i< array.length; i++) {
            if (array[i].length() >= longestWord.length()) {
                longestWord = array[i];
            }
        }
        System.out.println("Length and longest word is: "+longestWord.length()+" "+ longestWord);



    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        //implement

        return map;
    }
}
