package Java_8.Lamdas;

public class Example4 {
    public static void main(String[] args) {
        NumTest n1=x->x%2==0;
        System.out.println(n1.isEven(2));
        System.out.println(n1.isEven(3));
    }
}

@FunctionalInterface
interface NumTest{
    boolean isEven(int x);
}

