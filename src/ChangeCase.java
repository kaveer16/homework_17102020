//a program to convert the upper case to lower case & Vice Versa
//Created By Raj Anilkumar on 21/10/2020

public class ChangeCase {


    public static void main(String[] args) {
        String str1= "MY NAME IS RAJ ANILKUMAR";
        // convert all upper case letters in to lower case letters
        System.out.println("Name: "+ str1.toLowerCase()); // using java method "toLowerCase()"
        // convert all lower case letters in to upper case letters
        String str2= "my hobby is to play cricket";
        System.out.println("Hobby: "+ str2.toUpperCase());// using java method "toUpperCase()"
    }

}
