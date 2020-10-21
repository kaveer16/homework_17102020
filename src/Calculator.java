public class Calculator {

    int a=100; double b=0.56; //instance/global variables

    double result = a-b;  double result1 = a*b; //instance/global

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

    //method on substraction
    public void substraction(){
        System.out.println(a-b);

    }
    //(static) method on multiplication
    public static void multiply(){
        PracticeOne hw=new PracticeOne();
        System.out.println("Multipication:" + hw.a * hw.b);
    }




}




