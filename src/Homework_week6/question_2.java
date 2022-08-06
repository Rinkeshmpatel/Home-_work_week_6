/* Write a Java programme using the following steps.
2.1 Declare two static variables
2.2 Declare one static method
2.3 Call both static variables into the static method inside the print statement. 2.4 Declare the Main method.
2.5 Call the static method into the Main method and Run the programme */

package Homework_week6;

public class question_2 {
    static int a = 10; // declare variable
    static String str= "Rink";

    public static void main(String [] args){  // user defined method
        System.out.println(a); //called static variable direct static method
        System.out.println(str);  //called static variable direct static method
    }
static void s1() // declare static method
{
    System.out.println(a); //called static variable direct static method
       System.out.println(str);  //called static variable direct static method


}
}

