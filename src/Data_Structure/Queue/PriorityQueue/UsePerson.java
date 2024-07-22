package Data_Structure.Queue.PriorityQueue;

import java.util.PriorityQueue;

public class UsePerson {
    public static void main(String[] args) {
        PriorityQueue<Person> pq=new PriorityQueue<>();
        pq.add(new Person("Ashmit",22));
        pq.add(new Person("Bhavika",21));
        pq.add(new Person("Anubhav",20));
        pq.add(new Person("Anchal",23));
        System.out.println(pq);
        while (!pq.isEmpty()){
            System.out.println(pq.remove());
        }
    }
}
