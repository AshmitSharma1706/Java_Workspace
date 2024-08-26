package Data_Structure_2.Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(digitSum2(1324));
    }
    public static int digitSum(int n){
        if(n<10){
            return n;
        }
        int x=n % 10;
        n=n/10;
        return x + digitSum(n);
    }
    public static int digitSum2(int n){
        if(n<10){
            return n;
        }
        return n % 10 + digitSum2(n/10);
    }
}
