package Day5.java.Day6;

public class AccessModifiers {
    public void publicMethod(){
        System.out.println("Public method");
    }
    private void privateMethod(){
        System.out.println("Private method");
    }
    void defaultMethod(){
        System.out.println("Default method");
    }
    protected void protectedMethod(){
        System.out.println("Protected method");
    }

    public static void main(String[] args) {
        AccessModifiers am= new AccessModifiers();
        am.publicMethod();
        am.privateMethod();
        am.defaultMethod();
        am.protectedMethod();
    }
}
