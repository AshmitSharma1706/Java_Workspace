package Data_Structure_2.BitwiseOperator;

public class CountSetBits {
    public static void main(String[] args) {
        int n=234567;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setBits(n));
        System.out.println(setBits2(n));
    }

    private static int setBits(int n) {
        int count=0;
        while (n>0){
            count++;
            n-=(n & -n);
        }
        return count;
    }
    private static int setBits2(int n) {
        int count=0;
        while (n>0){
            count++;
            n=n & (n-1);
        }
        return count;
    }
}
