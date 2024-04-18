package Data_Structure.Stack.Using_Javas_Stack;

import java.util.Stack;

public class UseStack4 {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("Top element: "+s.peek());
        while (!s.empty()){
            System.out.println(s.pop());
        }
    }
}
