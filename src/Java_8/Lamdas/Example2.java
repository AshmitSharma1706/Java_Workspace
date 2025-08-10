package Java_8.Lamdas;

public class Example2 {
    public static void main(String[] args) {
        MathOperation m1=(a,b)->a+b;
        MathOperation m2=(a,b)->a-b;
        System.out.println(m1.operate(20,10));
        System.out.println(m2.operate(20,10));
    }
}

@FunctionalInterface
interface MathOperation{
    int operate(int a,int b);
}
