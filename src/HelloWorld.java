// work by raj anilkumar

import javax.xml.bind.SchemaOutputResolver;

public class HelloWorld {

    int a=100; double b=0.56; double result = a-b;  //instance/global variables

    public static void main(String[] args) {

        HelloWorld hw=new HelloWorld();
        hw.alpha();
        hw.substraction();


    }
    public void alpha(){  //instance method

        System.out.println(a);
        System.out.println(b);
    }

    //extra method for further understanding
    public void substraction(){
        System.out.print(a-b);

    }




}
