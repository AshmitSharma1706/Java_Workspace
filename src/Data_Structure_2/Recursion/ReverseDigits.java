package Data_Structure_2.Recursion;

public class ReverseDigits {
    public static void main(String[] args) {
        System.out.println(reverse2(1234));
    }
    static int sum=0;
    public static void reverse(int n){
        if(n==0){
            return;
        }
        sum = sum * 10 + n%10;
        reverse(n/10);
    }
    public static int reverse2(int n){
        int digits= (int)(Math.log10(n))+1;
        return helper(n,digits);
    }

    public static int helper(int n, int digits) {
        if(n<10){
            return n;
        }
        return n%10 * (int)(Math.pow(10,digits-1)) + helper(n/10,digits-1);
    }
}
