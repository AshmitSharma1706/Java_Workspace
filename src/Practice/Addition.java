package Practice;

public class Addition {
    public static void main(String[] args) {
        System.out.println(add(10,20));
        System.out.println(subtraction(10,20));
        System.out.println(multiply(10,20));
        System.out.println(divide(10,20));
    }
    public static int add(int first ,int second){
        return first+second;
    }
    public static int subtraction(int first , int second){
        return first-second;
    }
    public static int multiply(int first ,int second){
        return first*second;
    }
    public static double divide(double first ,double second){
        if (second==0){
            System.out.println("Denominator cannot be zero");
            System.exit(0);
        }
        return (double) first /second;
    }
}
