package Data_Structure.LinkedList.Application_of_LinkedList.Dynamic_Queue;

import Data_Structure.Queue.Creating_Own_Queue.QueueException;

public class Queue {
    private Node front;
    private Node rear;
    private int count=0;

    public void enqueue(int data){
        Node p=new Node(data);
        if(front==null){
            front=p;
        }
        else{
            rear.setNext(p);
        }
        rear=p;
        count++;
    }

    public int dequeue(){
        if(front==null){
            throw new QueueException("Queue is empty..!");
        }
        int data= front.getData();
        front=front.getNext();
        if(front==null){
            rear=null;
        }
        count--;
        return data;
    }

    public int peek(){
        if(front==null){
            throw new QueueException("Queue is empty..!");
        }
        return front.getData();
    }

    public int size(){
        return count;
    }
    public boolean isEmpty(){
        return count==0;
    }
}
