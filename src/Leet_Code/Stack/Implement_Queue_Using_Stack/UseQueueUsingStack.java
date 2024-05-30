package Leet_Code.Stack.Implement_Queue_Using_Stack;

public class UseQueueUsingStack {
    public static void main(String[] args){
        QueueUsingStack queue =new QueueUsingStack();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Top ele: "+ queue.peek());//10
        System.out.println("Dequeued: "+ queue.dequeue());//10
        System.out.println("Now Top ele: "+queue.peek());//20
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("Top ele: "+queue.peek());//20
        System.out.println("Dequeued: " + queue.dequeue());//20
        System.out.println("Now Top ele: "+queue.peek());//30
    }
}
