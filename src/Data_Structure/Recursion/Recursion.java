package Data_Structure.Recursion;

public class Recursion {
    public static void main(String[] args) {
        printIncr(5);
    }
    public static void printIncr(int n){
        if(n>0){
            System.out.println(n);
            printIncr(n-1);
            System.out.println(n);
        }
    }
}
