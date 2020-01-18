package math.problems;

import databases.ConnectToSqlDB;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class LowestNumber {

	public static void main(String[] args) {
		/*
		 * Write java solution to find the lowest number from this array.
		 * Use one of the databases from mysql or mongodb to store and to retrieve.
		 */
		int array[] = new int[]{211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};

		//find lowest number from the array
		int size = array.length;
		Arrays.sort(array);
		int lowestNum = array[0];
		System.out.println("The lowest number is: " + lowestNum);
		}
	}
