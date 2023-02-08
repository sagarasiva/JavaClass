package Day5.java.Day6;

//child class--------------parent class
public class Mountains extends Nature {
    public static void main(String[] args) {
        Mountains mou=new Mountains();
        mou.rivers();
        mou.trees();
        mou.flowers();
        mou.ice();

    }
    public void ice(){
        System.out.println("ice");
    }
}
