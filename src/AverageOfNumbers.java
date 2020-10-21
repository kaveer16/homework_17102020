/* A Java program that takes three numbers as input to
calculate and print the average of the numbers.
Created By Raj Anilkumar on 21/1/2020
*/


import java.util.Scanner;
public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner avg = new Scanner(System.in);
        System.out.println("Input 1st Number:");
        int num1 = avg.nextInt();
        System.out.println("Input 2nd Number:");
        int num2 = avg.nextInt();
        System.out.println("Input 3rd Number:");
        int num3 = avg.nextInt();

        System.out.println("Average of 3 Numbers =" + (num1 + num2 +num3)/3);


    }







}
