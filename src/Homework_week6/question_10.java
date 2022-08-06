package Homework_week6;
// Q 10> Write a Java program that takes a number as input and prints
// its multiplication table up to 10.

import java.util.Scanner;

public class question_10 {
// main method

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// declare scanner class
        System.out.println("Input a Number :");// print
        int num = sc.nextInt();
        System.out.println("Expected Output :");
        int i; //reading a number which table is to be print
        for (i = 1; i <= 10;i++) //loop start execution from and execute the condition
        {
            System.out.println(num + "x" + i + "=" + num * i); //printing statement with logic
        }
    }
}