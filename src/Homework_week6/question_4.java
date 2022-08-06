package Homework_week6;

public class question_4 {

    int a = 10; // declare instance variable

    String str ="Rinkesh";

    static int a1 = 20;
    static String str1 ="Rink";
    public static void main(String [] args){

        question_4 q4 = new question_4(); //create object
        q4.m1();// called instance method
        System.out.println(q4.a);
        System.out.println(q4.str);
        System.out.println(a1);
        System.out.println(str1);
    }
    void m1()
    {
        System.out.println(a);
        System.out.println(str);
        System.out.println(a1);
        System.out.println(str1);
    }
static void s1()
{
    question_4 q4 = new question_4();
    System.out.println(q4.a);
    System.out.println(a1);
    System.out.println(q4.str);
    System.out.println(str1);
}
}
