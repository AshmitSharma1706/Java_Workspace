package Java_8.Collection.Set;

import java.util.Collections;
import java.util.TreeSet;

public class Example3 {
    public static void main(String[] args) {
        TreeSet<String> ts=new TreeSet<>(Collections.reverseOrder());
        ts.add("Ashmit");
        ts.add("Bhavika");
        ts.add("Anubhav");
        ts.add("Anchal");
        ts.add("Sanchi");
        System.out.println(ts);
    }
}
