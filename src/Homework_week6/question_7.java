package Homework_week6;
//  Write a program to insert any temperature value in degree
//  Fahrenheit and convert to degree Celsius ((F − 32) × 5/9 = 0°C).

public class question_7 {

    public static void main(String[] args)

    {
        float  f = 43; // declare local vriable
        float celsius;
        celsius = ((f-32)*5/9);  // formula
        System.out.println("Convert fahernheit to celsius : "+celsius);
        // printing statement wih variable
    }
}