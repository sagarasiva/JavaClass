package Day6;

public class ConstructorBooks {
    //example of constructor
    public ConstructorBooks() {
        System.out.println("Default constructor ");
    }
    //constructor overloading
    //sae class name passing parameters
    public ConstructorBooks(String autor,String name) {
        System.out.println("Autor "+autor);
        System.out.println("Name "+name);
    }

    public static void main(String[] args) {

        ConstructorBooks books= new ConstructorBooks( "adhithya", "Automation");
    }
}
