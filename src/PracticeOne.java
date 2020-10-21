/* Raj Anilkumar on 18/10/2020

Declare two instance variable outside main method.
Declare main method
Call below one method in main method
Declare one instance method and call those two variables.
 */
public class PracticeOne {

    int a=100; double b=0.56; //instance/global variables

    double result = a-b;  double result1 = a*b; //instance/global variables for extra methods

    public static void main(String[] args) {

            PracticeOne hw=new PracticeOne();
            hw.alpha();
            hw.substraction();
            hw.multiply();


        }
        public void alpha(){  //instance method

            System.out.println(a);
            System.out.println(b);
        }

        //extra method on substraction for further understanding
        public void substraction(){
            System.out.println(a-b);
            System.out.println(b-a);

        }
        //extra (static) method on multiplication for further understanding
        public static void multiply(){
            PracticeOne hw=new PracticeOne();
            System.out.println(hw.a * hw.b);
        }




    }

