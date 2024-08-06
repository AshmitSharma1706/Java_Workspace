package Data_Structure.Recursion;

public class TreeRecursion {
    public static void main(String[] args) {
        System.out.println(fibo(5));
        funA(20);
        System.out.println();
        System.out.println(fun(95));
    }
    public static int fibo(int n){
        int x;
        if(n<=1){
            return n;
        }
        x=fibo(n-2)+fibo(n-1);
        return x;
    }
    public static void funA(int n){
        if(n>0){
            System.out.print(n+",");
            funB(n-1);
        }
    }
    public static void funB(int n) {
        if(n>0){
            System.out.print(n+",");
            funA(n/2);
        }
    }
    public static int fun(int n){
        if(n>100){
            return n-10;
        }
        else {
            return fun(fun(n+11));
        }
    }
}
