package Practice;

public class Increment_Decrement_Operator {
    public static void main(String[] args) {
        int a=2;
        int b=0;
        b=a+++a+--a;
        System.out.println("a="+a+" b="+b);
//        b=a+2+3+++a;
        System.out.println("a="+a+" b="+b);
    }
}
