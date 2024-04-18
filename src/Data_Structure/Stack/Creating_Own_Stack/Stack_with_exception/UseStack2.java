package Data_Structure.Stack.Creating_Own_Stack.Stack_with_exception;

public class UseStack2 {
    public static void main(String[] args) {
        Stack2 obj=new Stack2(5);
        int x=10;
        try {
            for (int i = 0; i < 6; i++) {
                obj.push(x);
                System.out.println("Pushed:" + x);
                x += 10;
            }
        }catch (StackException se){
            System.out.println(se.getMessage());
        }
        System.out.println("Top element of the Stack is:"+obj.peek());
        try {
            for (int i = 0; i < 6; i++) {
                x = obj.pop();
                System.out.println("Popped:" + x);
            }
        }catch (StackException se){
            System.out.println(se.getMessage());
        }
    }
}
