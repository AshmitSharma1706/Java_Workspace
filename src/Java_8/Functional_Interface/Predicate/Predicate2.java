package Java_8.Functional_Interface.Predicate;

import java.util.function.Predicate;

public class Predicate2 {
    public static void main(String[] args) {
        Predicate<String> p=s-> new StringBuilder(s).reverse().toString().equals(s);
        System.out.println(p.test("nitin"));
        System.out.println(p.test("abba"));
        System.out.println(p.test("ashmit"));
    }
}
