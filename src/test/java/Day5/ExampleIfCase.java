package Day5;

import java.util.Scanner;

public class ExampleIfCase {
    public static void main(String[] args) {
        Scanner sca =new Scanner(System.in);
        System.out.println("Enter the mark:");
        int mark= sca.nextInt();

        if (mark<35)
        {
            System.out.println("FAIL");
        } else if (mark>=35 && mark<40) {
            System.out.println("THIRD CLASS");

        } else if (mark>=40 && mark<50) {
            System.out.println("SECOND CLASS");
        } else if (mark>=50 && mark<80) {
            System.out.println("FIRST CLASS");
        }else if (mark>=80 && mark<=100) {
            System.out.println("TOP CLASS");
        }else {
            System.out.println("PASS CLASS");
        }

    }
}
