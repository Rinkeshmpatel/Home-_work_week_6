package Homework_week6;
//q 13> Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

import java.util.Scanner;

public class question_13 {
    //main method user defined method
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in); //take input from user using scanner class
        System.out.println("Enter the first number : ");
        double a = sc.nextInt(); // Scanner method
        System.out.println("Enter the second number : ");
        double b = sc.nextInt();
        System.out.println("Enter the third number : ");
        double c = sc.nextInt();
        double avg; // declare local variable
        avg=a+b+c/3;  // avg formula
        System.out.println("The average is : "+ avg); // printing statement


    }

}
