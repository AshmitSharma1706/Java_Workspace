package Java_8.Lamdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example6 {
    public static void main(String[] args) {
        List<Integer> numList= Arrays.asList(10,5,25,2,12);
        Comparator<Integer> c=(a,b)->b-a;
        Collections.sort(numList,c);
        System.out.println(numList);
        System.out.println(numList.getClass().getName());
    }
}

