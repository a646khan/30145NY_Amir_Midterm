package problemandsolutions;


import java.util.Scanner;

public class ArithmeticOperator {
    public static int table;
    //Write Java program to allow the user to input two integer values and then the program prints the results of adding,
    // subtracting, multiplying, and dividing among the two values.



    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter your first value");
        int num=input.nextInt();
        System.out.println("Enter your second number");
        int num1=input.nextInt();
        System.out.println("The sum of two value is"+" "+ (num+num1));
        System.out.println("The subtraction of two value is"+" "+ (num - num1));
        System.out.println("The product of two value is"+" "+num1*num);
        System.out.println("The division of two value is"+" "+num1/num);








    }



}






