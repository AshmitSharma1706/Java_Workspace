package Data_Structure.Stack.Creating_Own_Stack.Stack_with_exception;

public class Stack2 {
    private int tos;
    private int []arr;
    private int size;

    public Stack2(int size) {
        arr=new int[size];
        this.size = size;
        tos=-1;
    }
    public void push(int x){
        if (tos==size-1){
            throw new StackException("Stack Overflow");
        }
        tos++;
        arr[tos]=x;
    }
    public int pop(){
        if (tos==-1){
            throw new StackException("Stack Underflow");
        }
        int x;
        x=arr[tos];
        tos--;
        return x;
    }
    public int peek(){
        if (tos==-1){
            throw new StackException("Stack OverFlow");
        }
        int x;
        x=arr[tos];
        return x;
    }
}
