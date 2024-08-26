package Data_Structure_2.Recursion;

public class Concept {
    public static void main(String[] args) {
        fun(5);
    }
    public static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
//        fun(n--);  //stack overflow..!

        fun(--n);  //it will work...
    }
}
