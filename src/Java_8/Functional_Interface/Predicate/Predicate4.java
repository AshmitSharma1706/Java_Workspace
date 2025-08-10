package Java_8.Functional_Interface.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicate4 {
    public static void main(String[] args) {
        Predicate<Integer> p1=x->x%2==0;
        Predicate<Integer> p2=x->x%3==0;
        List<Integer> numList= Arrays.asList(10,9,15,2,12,3,6,18);
        System.out.println("Multiple of 2:");
        apply(p1,numList);
        System.out.println("Multiple of 3:");
        apply(p2,numList);
        System.out.println("Multiple of 2 and 3:");
        apply(p1.and(p2),numList);

    }
    public static void apply(Predicate<Integer> p, List<Integer> list){
        for (Integer x:list){
            if(p.test(x)){
                System.out.println(x);
            }
        }
    }
}
