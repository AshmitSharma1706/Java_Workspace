package Java_8.Collection.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Example4 {
    public static void main(String[] args) {
        Map<Integer,String> m=new HashMap<>();
        m.put(101,"Amit");
        m.put(102,"Sumit");
        m.put(103,"Chetan");
        Set<Map.Entry<Integer,String>> entrySet=m.entrySet();
        for (Map.Entry<Integer,String>entry : entrySet){
            System.out.println(entrySet.equals(entry));
        }
    }
}
