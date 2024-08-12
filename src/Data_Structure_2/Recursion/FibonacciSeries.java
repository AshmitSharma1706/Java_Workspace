package Data_Structure_2.Recursion;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println(fibonacciFormula(47));
    }
    public static int fibonacciFormula(int n){
        return (int) ((Math.pow(((1+Math.sqrt(5))/2),n))/Math.sqrt(5));
    }
}
