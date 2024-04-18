package Leet_Code;

public class DivideTwoInteger {
    public static void main(String[] args) {
        System.out.println(divide(-2147483648,-1));
    }
    public static int divide(int dividend, int divisor) {
        int result=0;
        try{
            result= dividend / divisor;
        }
        catch(ArithmeticException ae){
            System.out.println("Divisor cannot be 0..!"+ae.getMessage());
        }
        return result;
    }
}
