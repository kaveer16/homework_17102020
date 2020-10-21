//A program to insert any temperature value in degree Fahrenheit and convert to degree Celsius
//Created By Raj Anilkumar on 21/10/2020

import java.util.Scanner; //Using a scanner class to input data from user end

public class TempCelsius {

    public static void main(String[] args) {
        Scanner tc=new Scanner(System.in); //creating a scanner object
        System.out.println("Temperature in fahrenheit is ");
        //Fahrenheit value can be in decimal, thereby using here double as datatype
        double fahrenheit=tc.nextDouble();
        //using formula to convert fahrenheit into Celsius((F− 32) × 5/9 = 0°C)

        System.out.println("Temperature in degree celsius is " + (fahrenheit-32)*5/9);


    }
}
