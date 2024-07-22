package Data_Structure.Queue.PriorityQueue;

import java.util.PriorityQueue;

public class PQ {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(5);
        pq.add(2);
        pq.add(11);
        pq.add(25);
        pq.add(4);
        pq.add(18);
        System.out.println(pq);
        while (!pq.isEmpty()){
            System.out.println(pq.remove());
        }
    }
}
