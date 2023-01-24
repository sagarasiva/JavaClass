package Day2;

public class Calculator {
    //adding method
    public static void main(String[] args) {
        Calculator calu = new Calculator();//class object
        calu.addnumber(20,30);//pass the value
        calu.subtract(500,200);
        calu.multiply(25,80);
        calu.division(500,5);
        calu.modules(500,10);


    }
//method
    //adding two numbers
  public void addnumber(int x,int y){
    int sum =x+y;
    System.out.println("sum:"+sum);
}
    public void subtract(int x,int y){
        int sub =x-y;
        System.out.println("subtrac:"+sub);
    }

    public void multiply(int x,int y){
        int mult =x*y;
        System.out.println("multiply:"+mult);
    }
    public void division(int x,int y){
        int div =x/y;
        System.out.println("division:"+div);
    }
    public void modules(int x,int y){
        int mod =x%y;
        System.out.println("modulas:"+mod);
    }
}