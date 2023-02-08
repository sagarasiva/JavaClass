package Day7;
//Write a Java method to find the smallest number among three numbers.
public class Level2Smallest {
    public static void main(String[] args) {
        int a = 37;
        int b = 25;
        int c = 29;

        System.out.println("Input the first  number is :37");
        System.out.println("Input the Second  number is :25");
        System.out.println("Input the third  number is :29");
        if (a < b && a<c) {
                System.out.println("Smallest number is :"+a);
            } else if (b<a && b<c){
            System.out.println("Smallest number is :"+b);
            }
        else {

            System.out.println("Smallest number is :"+c);
        }
    }

}
