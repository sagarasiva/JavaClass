package Pratice;

public class Assignment {
    public static void main(String[] args) {
        String name = "Adhithya12345";
        //char[] ch =name.toCharArray();//sting value is coverting in to charater "0,1,2,3....
        int num = 0;
        for (Character ch : name.toCharArray()) {//optimization reduce te line count
            if (Character.isDigit(ch)) {
                num = Character.getNumericValue(ch) + num;//converting char in to interger and count the each num
            }
        }
        System.out.println("The total count of the number is" + num);
    }
}