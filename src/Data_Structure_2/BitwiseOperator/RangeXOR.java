package Data_Structure_2.BitwiseOperator;

public class RangeXOR {
    public static void main(String[] args) {
        int a=3;
        int b=9;
        int ans=xor(b)^xor(a-1);
        System.out.println(ans);

        //for check only, this will give TLE for large number
        int result=0;
        for (int i = a; i <=b; i++) {
            result^=i;
        }
        System.out.println(result);
    }
    public static int xor(int a){
        if(a%4==0){
            return a;
        }
        if(a%4==1){
            return 1;
        }
        if(a%4==2){
            return a+1;
        }
        return 0;
    }
}
