package Day5.java.Day3;

import java.util.Scanner;

public class ScannerCalculator {
    public static void main(String[] args) {
        System.out.println("Arithmeic operation");


    //scanner calulator
        { //enter first number and second number
            Scanner scan = new Scanner(System.in);//sanner object created
            System.out.println("Enter the first number:");
            int firstnumber = scan.nextInt();//declaration
            System.out.println("Enter the Second number:");
            int secondnumber = scan.nextInt();
            //logic
            int total=firstnumber+secondnumber;//addition
            int totalsub=firstnumber-secondnumber;//subtration
            int totalmul=firstnumber*secondnumber;//multiplication
            int totaldiv=firstnumber/secondnumber;//division
            int totalmod=firstnumber%secondnumber;//modulas
            //print all the operations
            System.out.println("sum of the two number is :" + total);
            System.out.println("Subtraction of the two number is :" + totalsub);
            System.out.println("Multiplication of the two number is :" + totalmul);
            System.out.println("division of the two number is :" + totaldiv);
            System.out.println("Modulus of the two number is :" + totalmod);


        }

    }
}