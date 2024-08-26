package Data_Structure_2.Recursion;

public class Sum {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
    public static int sum(int n){
        if(n<2){
            return 1;
        }
        return n + sum(n-1);
    }
}
