package Day2;

public  class LogicalOperator {
    //prg using logical operator
    public static void main(String[] args) {
        //decalaration
        int a=80;//initialization
        int b=50;
        System.out.println(a<b&& b>50);//flase
        System.out.println(a>b&& b==50);//true
        System.out.println(a>b|| b==50);//true
        System.out.println(a>100|| b==50);//true
        System.out.println(a!=50);//true


    }
}