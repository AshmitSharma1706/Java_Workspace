package Data_Structure_2.Recursion;

public class PrintingNumbers {
    public static void main(String[] args) {
        fun3(5);
    }
    public static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
    public static void fun2(int n){
        if(n==0){
            return;
        }
        fun2(n-1);
        System.out.println(n);
    }
    public static void fun3(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fun3(n-1);
        System.out.println(n);
    }
}
