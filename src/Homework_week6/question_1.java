/* 1. Write a Java programme using the following steps.
1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement. 1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and Run the programme */


package Homework_week6;

public class question_1 {

    int c = 5;  // instance variable

    String str = "Patel"; // instance variable

    //main method
            public static void main (String [] args) {
                question_1 q = new question_1(); // create object
                q.p1();// called instance method using object

            }
void p1() // instnce method

{
    System.out.println(c);// instance method call instance variable
    System.out.println(str);

        }


    }


