package Leet_Code.Stack;

import Data_Structure.Queue.Creating_Own_Queue.QueueException;
import Practice.QuadraticEquation;

import java.util.Stack;

public class QueueUsingStack {
    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public QueueUsingStack() {
        s1=new Stack<>();
        s2=new Stack<>();
    }
    public void transfer(Stack<Integer> s1,Stack<Integer> s2){
        while (!s1.empty()){
            s2.push(s1.pop());
        }
    }
    public void enqueue(int x){
        s1.push(x);
    }
    public int dequeue(){
        if(s1.empty()){
            throw new QueueException("Queue underflow");
        }
        transfer(s1,s2);
        int x=s2.pop();
        transfer(s2,s1);
        return x;
    }
    public int peek(){
        if(s1.empty()){
            throw new QueueException("Queue underflow");
        }
        transfer(s1,s2);
        int x=s2.peek();
        transfer(s2,s1);
        return x;
    }
}
