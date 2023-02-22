package Pratice;

public class Unicode {
    public static void main(String[] args) {
        String str= "w3resource.com";
        System.out.println("The orginal string is "  + str);
        int a = str.codePointAt(1);
        int b = str.codePointAt(9);
        System.out.println("The character unicode is " + a );
        System.out.println("The character unicode is " + b );
    }
}
