package Data_Structure.Recursion;

public class Recursion3 {
    public static void main(String[] args) {
        greetings(5);
    }
    public static void greetings(int n){
        if(n>0){
            System.out.println("Hello..!");
            greetings(n-1);
            System.out.println("Bye..!");
        }
    }
}
