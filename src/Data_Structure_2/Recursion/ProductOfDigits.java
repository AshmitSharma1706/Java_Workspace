package Data_Structure_2.Recursion;

public class ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(digitProduct(13240));
    }
    public static int digitProduct(int n){
        if(n<10){
            return n;
        }
        return n % 10 * digitProduct(n/10);
    }
}
