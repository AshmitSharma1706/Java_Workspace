package Data_Structure.LinkedList.Application_of_LinkedList.Dynamic_Queue;

public class UseQueue {
    public static void main(String[] args) {
        Queue q=new Queue();
        System.out.println("Is queue empty ?"+q.isEmpty());
        System.out.println("Total ele:" + q.size());
        q.enqueue(10);
        q.enqueue(20);
        System.out.println("Total ele:" + q.size());
        System.out.println("Is queue empty ?"+q.isEmpty());
        System.out.println("Front ele:"+q.peek());
        System.out.println("Removing front ele:"+q.dequeue());
        System.out.println("Total ele:"+q.size());
        System.out.println("Is queue empty ?"+q.isEmpty());
        System.out.println("Front ele:"+q.peek());
        System.out.println("Removing front ele:"+q.dequeue());
        System.out.println("Total ele:"+q.size());
    }
}
