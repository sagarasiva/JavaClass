package Day5.java.Day3;

import java.util.Scanner;

public class ExampleScanner {
    //scanner example
   public  static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();//initailzation
        System.out.println("Enter your name ");
        String name = scanner.next();//string is used due to calling string object
        System.out.println(" Hi " + name + " you are  " + age + " years old ");//print

    }
}
