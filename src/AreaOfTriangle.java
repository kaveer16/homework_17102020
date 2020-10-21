//A program to calculate area of triangle.
// Created By Raj Anilkumar on 21/10/2020

import java.util.Scanner; //Using a scanner class to input data from user end

public class AreaOfTriangle<area> {

    public static void main(String[] args) {
        Scanner at=new Scanner(System.in); //creating a scanner object
        System.out.println("Base of Triangle =" );
        double base= at.nextDouble();
        System.out.println("Height of Triangle =" );
        double height= at.nextDouble();

        // Formula for calculating Area of Triangle

        double area = (base*height)/2;


        System.out.println("Area of Triangle = "  + area);

    }



    }

