package Pratice;

public class UnicodeBefore {
    public static void main(String[] args) {
        String str= "w3resource.com";
        System.out.println("The orginal string is "  + str);
        int a = str.codePointBefore(1);
        int b = str.codePointBefore(9);
        System.out.println("The character unicode is " + a );
        System.out.println("The character unicode is " + b );
    }
}
