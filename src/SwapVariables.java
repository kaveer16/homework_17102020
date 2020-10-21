//a Java program to swap two variables.
//Created By Raj Anilkumar on 21/10/2020

public class SwapVariables {

    public static void main(String[] args) {
        int a=25; int b=52;
        System.out.println("Before Swapping: a,b = "+a+", "+ +b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After Swapping: a,b = "+a+", "+ +b);

    }
}
