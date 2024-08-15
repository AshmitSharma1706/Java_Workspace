package Data_Structure_2.BitwiseOperator;

public class NthMagicNumber {
    public static void main(String[] args) {
        System.out.println(getNumber(6));
    }
    public static int getNumber(int n){
        int result=0;
        int base=5;
        while (n>0){
            int last= n&1;
            n=n>>1;
            result += last*base;
            base=base*5;
        }
        return result;
    }
}
