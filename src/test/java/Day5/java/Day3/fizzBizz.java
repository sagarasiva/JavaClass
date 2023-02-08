package Day5.java.Day3;

import java.util.Scanner;
   //write a program to create fizz or bizz
   // if the number is multiplied by 3 print bizz
   //if the number is multiplied by 5 print fizz
   //then the number is multiplied by both print bizz or fizz
public class fizzBizz {
    //fizz or bizz program

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range of the number:");
        int n=sc.nextInt();
        System.out.println("The number fizz or bizz is");
        //loop execute when the number is equal to n
        for (int i=1;i<=n;i++)
        {
           if (i%3==0&& i%5==0) {//if the number execute while the multiped is 3 or 5
               System.out.println("Fizz bizz");//print fizz bizz
           }
           //multipiled of 3
           else if (i%3==0) {
               System.out.println("fizz");//print multipied of 3 is fizz

           }
           //multipiled  of 5
           else if (i%5==0) {
               System.out.println("bizz");//print multipied of 5 is bizz
           }
           else {
               System.out.println(i);//otherwise the print the number is multied 3 or 5
           }

        }
      sc.close();//close the scanner
    }
}
