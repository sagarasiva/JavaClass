package Day5.java.Day7;

import java.util.Scanner;

//Write a program in Java to input 5 numbers from keyboard and find their sum and average.
public class Level2SumAvg {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sum=0;
        float avg=0;
        System.out.println("Input the 5 numbers: ");
        for(int i=1;i<=5 ;i++){
            int num = input.nextInt();
            sum +=num;
        }
        System.out.println("Sum of the 5 numbers is :"+sum);
        avg=sum/5;
        System.out.println("Aerage of the 5 numbers is :" + avg);
    }
}
