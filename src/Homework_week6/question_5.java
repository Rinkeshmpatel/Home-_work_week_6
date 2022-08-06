package Homework_week6;
//Write a program for a calculator with addition, subtraction,
// multiplication and division methods all with parameters
// and use string concatenation methods.(Note: Two static and Two instance methods.)

public class question_5 {
    // main method
 public static void main (String [] args){

     question_5 q5 = new question_5 (); // create on object
     q5.addition (10,20);
     q5.subtraction(20,10);
     q5.multiplication (20,20);// called void method using object for multiplication
     q5.division(20,10); // called void method using object for division

 }
 public static int addition (int a, int b)
 {
     int result =(a+b);
     System.out.println("Addition : "+ (result));
     return result;

 }
 public static int subtraction (int a, int b){
     int result =(a-b);
     System.out.println("Subtraction : "+(a-b));
     return result;

 }

        public void multiplication (int a, int b)
        {System.out.println("multiplication :"+(a*b));
        }
void division(int a, int b) {
            System.out.println("Division : "+(a/b));
        }

}
