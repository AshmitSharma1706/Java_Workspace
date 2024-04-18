package Data_Structure.Stack.Creating_Own_Stack.Stack_Using_Array;

public class UseStack {
    public static void main(String[] args) {
        Stack obj=new Stack(5);
        int x=10;
        for(int i=0; i<5; i++){
            obj.push(x);
            System.out.println("Pushed:"+x);
            x+=10;
        }
        System.out.println("Top element of the Stack is:"+obj.peek());
        for(int i=0; i<5; i++){
            x=obj.pop();
            System.out.println("Popped:"+x);
        }
    }
}
