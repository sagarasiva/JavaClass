package Day2;

public class SwapWithoutthirdVariable {
    public static void main(String[] args) {
        //declartion
        int a = 20;//initializing
        int b = 30;//intializing

        System.out.println("Before swaping " + " a=" + a + "," + "B=" + b);//before swap
        //logic
        a = a + b;//30+20=50
        b = a - b;//50-30=20
        a = b - a;//20-50=30
        System.out.println("After swaping " + " a=" + a + "," + "B=" + b);//after swap
    }
}