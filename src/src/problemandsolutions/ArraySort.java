package problemandsolutions;

import json.parser.JsonReaderUtil;

import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        // By using the bubble sort algorithm, write a Java program to sort an integer array of 10 elements in ascending.

        int[] numArray = {2,44,55,64,43,235,4};// declaring an array...
        //Bubble Sort being done here
        int n = numArray.length;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {

                if (numArray[j - 1] > numArray[j]) {
                    temp = numArray[j - 1];
                    numArray[j - 1] = numArray[j];
                    numArray[j] = temp;
                }
            }
        }

        System.out.println("Following arrays sorted: ");
        for (int k = 0; k < numArray.length; k++) {
            System.out.println(numArray[k]);
        }



    }
}