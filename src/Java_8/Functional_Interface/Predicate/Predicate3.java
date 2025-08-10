package Java_8.Functional_Interface.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicate3 {
    public static void main(String[] args) {
        Predicate<Integer> p=x->x>0;
        List<Integer> numList= Arrays.asList(10,-5,25,-2,12);
        for (Integer x:numList){
            if(p.test(x)){
                System.out.println(x);
            }
        }
    }
}
