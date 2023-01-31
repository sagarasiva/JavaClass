package Day4;

public class ExampleString {
    public static void main(String[] args) {
//   string functions example
        String name= "india";
        String str=" India is my favorite place ";
        System.out.println(name.length());//count thelenght of te entire tring
        System.out.println(name.charAt(4));//count the 4 charcter of the string
        System.out.println(name.toUpperCase());//convert all thestring into uppercase
        System.out.println(name.toLowerCase());//convert all the string into lower case
        System.out.println(name.replace("i","*"));//convert the all i into *
        System.out.println(name.contains("ia"));//true/flase--wheater check the string contain ia
        System.out.println(name.contains("is"));//true/flase--wheater check the string contain is
        System.out.println(name.startsWith("in"));//true/flase--wheater check the string starts with in
        System.out.println(name.startsWith("ia"));//true/flase--wheater check the string starts with ia
        System.out.println(name.endsWith("ia"));//true/flase--wheater check the string ends with ia
        System.out.println(name.endsWith("id"));//true/flase--wheater check the string ends with id
        System.out.println(name.equals("India"));//string is equals to India**uppercase is didn't take
        System.out.println(name.equals("india"));//true
        System.out.println(str.trim().length());//front space and back space igore and count

    }
}
