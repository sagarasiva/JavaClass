package Day6;

public class Pattern {
    //print pattern
    public static void main(String[] args) {
        int i,j,row=10;
        //for loop
        for (i=0;i<row;i++){
            //inner loop
            for (j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
