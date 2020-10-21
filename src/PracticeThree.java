/* Created By Raj Anilkumar on 18/10/2020
Declare one instance variable and Declare one static variable outside main method.
Declare main method
Call below two method in main method
Declare one instance method and call those two variables.
Declare one static method and call those two variables.
 */

import java.sql.SQLOutput;

public class PracticeThree {
    char Grade = 'A';            // Instance/global variable
    String Grade1 = "A+";        //Extra Instance variable for further understanding
    static String subject= "Maths"; //static/global variable
    static String subject1= "Science"; //Extra Static variable for further understanding


    public static void main(String[] args) {
    PracticeThree P3=new PracticeThree(); // Object Creation

    P3.result(); //Calling instance method
    P3.result1(); //calling static method

    }
    //Instance Method
    public void result(){
        System.out.println(subject+" - " + Grade);
    }
    //static method
    public static void result1(){
        PracticeThree P3=new PracticeThree(); // creating object
        System.out.println(subject1+ " - " + P3.Grade1);
    }
}
