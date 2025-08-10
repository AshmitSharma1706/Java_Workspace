package Java_8.Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class Example1 {
    public static void main(String[] args) {
        Map<Integer,String> m=new HashMap<>();
        m.put(101,"Amit");
        m.put(102,"Sumit");
        m.put(103,"Chetan");

        System.out.println(m);
        System.out.println(m.remove(103,"Chetan"));
        System.out.println(m);
    }
}
