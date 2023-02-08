package Day7;
//Take three numbers from the user and print the greatest number.
public class Level2Biggest {
    public static void main(String[] args) {
        int a = 25;
        int b = 78;
        int c = 87;

        System.out.println("Input the first  number is :25");
        System.out.println("Input the Second  number is :78");
        System.out.println("Input the third  number is :87");
        if (a > b && a>c) {
            System.out.println("Biggest number is :"+a);
        } else if (b>a && b>c){
            System.out.println("Biggest number is :"+b);
        }
        else {

            System.out.println("Biggest number is :"+c);
        }

    }
}
