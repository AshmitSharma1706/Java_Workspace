package Java_8.Functional_Interface.Function;

import java.util.function.Function;

public class Example1 {
    public static void main(String[] args) {
        Function<Integer,Double> function=x->Math.sqrt(x);
        System.out.println(function.apply(4));
    }
}
