package Data_Structure.LinkedList.Application_of_LinkedList.Dynamic_Stack;

import Data_Structure.Stack.Creating_Own_Stack.Stack_with_exception.StackException;

public class Stack {
    private Node tos;
    private int count=0;

    public void push(int data){
        Node p=new Node(data);
        p.setNext(tos);
        tos=p;
        count++;
    }

    public int pop(){
        if(tos==null){
            throw new StackException("Stack is empty..!");
        }
        int data= tos.getData();
        tos=tos.getNext();
        count--;
        return data;
    }

    public int peek(){
        if(tos==null){
            throw new StackException("Stack is empty..!");
        }
        return tos.getData();
    }
    public int size(){
        return count;
    }

    public boolean isEmpty(){
        return count==0;
    }
}
