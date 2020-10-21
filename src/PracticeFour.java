/* Created By Raj Anilkumar on 18/10/2020
Declare two instance variable and Declare two static variable outside main method.
Declare main method
Call below two method in main method
Declare one instance method and call those four variables.
Declare one static method and call those four variables.
 */

public class PracticeFour {
    byte marks = 95; byte marks1 = 93; //instance variables
    //static variables
    static String Subject = "Maths";
    static String Subject1 = "Science";
    //using extra static variables for further understanding
    static String Name= "KAVEER";
    static String Name1= "VIRAJ";
    public static void main(String[] args) {
       PracticeFour P4=new PracticeFour(); //object creation

       P4.Result(); // calling instance method
       P4.Result1(); //calling static method

    }
    public void Result(){
        System.out.println(Name);
        System.out.println(Subject+" = "+marks);
        System.out.println(Subject1+" = "+marks1);
    }

    public static void Result1(){
        PracticeFour P4=new PracticeFour();
        P4.marks= 92;
        P4.marks= 91;
        System.out.println(Name1);
        System.out.println(Subject+" = "+ P4.marks);
        System.out.println(Subject1+" = "+ P4.marks1);
    }

}
