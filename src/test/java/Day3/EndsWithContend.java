package Day3;
//Write a java program to check whether a given
//string end with the contends of another string
public class EndsWithContend {
    public static void main(String[] args) {
        System.out.println("String end with another string is it TRUE OR FALSE");
        //print the string
        String str="Python Exercise";//string to be
        //here endwith function is used to check the end of the sting
        System.out.println(str.endsWith("se"));//print the last letter check whether the true or flase
        System.out.println(str.endsWith("es"));
        System.out.println(str.endsWith("Exercise"));

    }
}