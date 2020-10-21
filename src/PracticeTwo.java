/* Created by Raj Anilkumar 0n 18/10/2020
Declare two static variable outside main method.
Declare main method
Call below one method in main method
Declare one static method and call those two variables.
 */

public class PracticeTwo {

    //static/global variables (outside main method & inside class)
static Boolean AreYouEnjoyingJava = true;
static Boolean IsItEasy= false;

    public static void main(String[] args) {
       PracticeTwo.reviewonjava(); // calling static method using class name

    }
    //static method
    public static void reviewonjava(){
        System.out.println(AreYouEnjoyingJava);
        System.out.println(IsItEasy);
    }






}
