package Day6;

public class GlobalLocal {
    String city="Paris";//global or instancevariable

    public void register(String name, String course)

    {
        int pincode=5697800;//local variable
        System.out.println("Name:" + name);
        System.out.println("Course:" + course);
        System.out.println("City:" + city);
        System.out.println("Pincode:" + pincode);
    }

    public static void main(String[] args) {
        GlobalLocal gl=new GlobalLocal();
        gl.register("Adhithya","javaSelenium");

    }
}
