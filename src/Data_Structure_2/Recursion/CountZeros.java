package Data_Structure_2.Recursion;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(count(302040));
    }
    public static int count(int n){
        return helper(n,0);
    }

    private static int helper(int n, int zeroCount) {
        if(n==0){
            return zeroCount;
        }
        if(n%10==0){
            return helper(n/10,zeroCount+1);
        }
        return helper(n/10,zeroCount);
    }
}
