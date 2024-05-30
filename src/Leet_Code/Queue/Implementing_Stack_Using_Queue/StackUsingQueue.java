package Leet_Code.Queue.Implementing_Stack_Using_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    private Queue<Integer> q1;
    private Queue<Integer> q2;


    public StackUsingQueue() {
        q1=new LinkedList<>();
        q2=new LinkedList<>();
    }

    public void push(int value){
        while (!q1.isEmpty()){
            q2.offer(q1.poll());
        }
        q1.offer(value);
        while (!q2.isEmpty()){
            q1.offer(q2.poll());
        }
    }

    public int pop(){
        if(q1.isEmpty()){
            System.out.println("Stack Underflow..!");
            return -1;
        }
        return q1.poll();
    }
    public int peek(){
        if(q1.isEmpty()){
            System.out.println("Stack Underflow..!");
            return -1;
        }
        return q1.peek();
    }

    public boolean empty(){
        return q1.isEmpty();
    }
}
