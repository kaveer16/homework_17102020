/*Write a program to enter any radius value of circle and find out the
area.
(Formula of Area A=PI*r*r)
Created by Raj Anilkumar on 21/10/2020
 */

import java.util.Scanner;    //Using a scanner class to input data from user end


public class AreaOfCircle{
    public static void main(String[]args){

       Scanner ac=new Scanner(System.in); //creating a scanner object

       System.out.println("input the value of radius: ");
        //radius value can be in decimal, thereby using here double as datatype
       double radius = ac.nextDouble();
       //Now Formula of Area of circle A=PI*r*r
       System.out.println("Area is = " + (Math.PI * radius * radius));
    }
}




