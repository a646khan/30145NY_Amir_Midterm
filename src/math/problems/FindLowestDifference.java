package math.problems;
import java.util.*;
public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};
        int a1 = array1.length;
        int a2 = array2.length;

        System.out.println("The lowest difference between the two array cells = "+difference(array1, array2, a1, a2));
    }


    static int difference(int [] array1, int [] array2, int a1, int a2)
    {
        Arrays.sort(array1);
        Arrays.sort(array2);

        int a = 0, b = 0;

        int result = Integer.MAX_VALUE;

        while (a < a1 && b < a2)
        {
            if (Math.abs(array1[a] - array2[b]) < result)
                result = Math.abs(array1[a] - array2[b]);

            if (array1[a] < array2[b])
                a++;

            else
                b++;
        }
        return result;



    }

}
