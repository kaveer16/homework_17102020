import java.util.Scanner;

/*Write a Java program that takes a number as input and prints its multiplication table
up to 10.
Created By Raj Anilkumar on 21/10/2020
 */


public class MutlipicationTable {

    static int n=8,c;

    public static void main(String[] args) {

        System.out.println("Mutlipication Table of " +  n);
    //using java method for multiplication for variables n & c
        for (c = 1; c <= 10; c++){
        System.out.println(n + "*" + c + " = " + (n*c));}

    }



}


