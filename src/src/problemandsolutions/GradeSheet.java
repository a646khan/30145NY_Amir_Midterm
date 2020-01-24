package problemandsolutions;

import java.util.Scanner;

public class GradeSheet {
    // Write a Java program that determines a student’s grade.
    //The program will read three types of scores(quiz, mid-term, and final scores) and determine the grade based on
    // the following rules:
    //- if the average score >=90% =>grade=A
    //- if the average score >= 70% and <90% => grade=B
    //- if the average score>=50% and <70% =>grade=C
    //- if the average score<50% =>grade=F
    //
    //See the example output below:
    //
    //Quiz score: 80
    //
    //Mid-term score: 68
    //
    //Final score: 90
    //
    //Your grade is B.


    public static void main(String[] args) {
        double quiz = 0;
        double midTerm = 0;
        double finalTerm = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("pls enter the quiz score");
        quiz = sc.nextDouble();
        System.out.println("pls enter the midTerm score");
        midTerm = sc.nextDouble();
        System.out.println("pls enter the  finalTerm score");
        finalTerm = sc.nextDouble();
        double avg = (quiz + midTerm + finalTerm) / 3;
        if (avg >= 90) {
            System.out.println("grade is A : " + avg);
        } else if (avg >= 70) {
            System.out.println("grade is B : " + avg);
        } else if (avg >= 50) {
            System.out.println("grade is c : " + avg);
        } else {
            System.out.println("grade is F : " + avg);


        }


    }

}