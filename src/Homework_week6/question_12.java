package Homework_week6;
//Q 12> Write a Java program to compute the specified expressions and print the output.
// Test Data: ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))

public class question_12 {

    //User define method

    public static void main(String[] args) {
 double a = 25.5;
 float  b= 3.5f;
 double c =  40.5;
 float d = 4.5f;
 // Test Data: ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
        System.out.println("Expected Result :" +((a*b-b*b)/(c-d)));

    }
}
