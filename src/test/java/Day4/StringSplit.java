package Day4;

public class StringSplit {
    public static void main(String[] args) {
        String name="Adhithya@12345789";
        //             0          1
        String nm=name.split("@")[0];
        //    initilzationn= split function is used to split the string
        //regex ---regular expression
        String me=name.split("@")[1];
        System.out.println(nm);
        System.out.println(me);
    }
}
