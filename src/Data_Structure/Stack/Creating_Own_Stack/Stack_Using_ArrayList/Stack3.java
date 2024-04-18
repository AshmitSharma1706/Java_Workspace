package Data_Structure.Stack.Creating_Own_Stack.Stack_Using_ArrayList;

import Data_Structure.Stack.Creating_Own_Stack.Stack_with_exception.StackException;

import java.util.ArrayList;
import java.util.List;

public class Stack3 {
    private int tos;
    private List<Integer> myList;

    public Stack3() {
        myList=new ArrayList<>();
        tos=-1;
    }
    public void push(int x){
        tos++;
        myList.add(tos,x);
    }
    public int pop(){
        if (tos==-1){
            throw new StackException("Stack Underflow");
        }
        int x;
        x=myList.remove(tos);
        tos--;
        return x;
    }
    public int peek(){
        if (tos==-1){
            throw new StackException("Stack Underflow");
        }
        int x;
        x=myList.get(tos);
        return x;
    }
}
