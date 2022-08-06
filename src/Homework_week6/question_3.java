package Homework_week6;

public class question_3 {
String str = "Rinkesh"; // declare instance variable
    static int a1 = 10; //declare static variable

    public static void main (String [] args){
        question_3 q3 = new question_3();
        q3.p1();
        System.out.println(q3.str);// called instance variable using static method need to create
        System.out.println(a1);//called static variable using static method (no need to create object)
    }
void p1()  // instance method
{
    question_3 q3 = new question_3(); // create object inside the instance method
    System.out.println(q3.str);
    System.out.println(a1);
}
 void s1()    // static method
    {
        System.out.println(a1); // called static variable direct
        question_3 que = new question_3(); //created object
        System.out.println(que.str); // called instance variable using object
    }

}

