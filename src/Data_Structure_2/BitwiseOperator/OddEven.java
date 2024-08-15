package Data_Structure_2.BitwiseOperator;

public class OddEven {
    public static void main(String[] args) {
        int n1=8;
        int n2=9;
        System.out.println(isEven(n1));
        System.out.println(isOdd(n1));
    }
    private static boolean isEven(int n) {
        return (n&1)!=1;
    }
    private static boolean isOdd(int n) {
        return (n&1)==1;
    }
}
