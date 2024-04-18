package Practice;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static int factorial(int num){
        int fact=0;
        for (int i=num; i<0; i--){
            fact=i*(num-1);
        }
        return fact;
    }
}
