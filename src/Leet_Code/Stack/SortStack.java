package Leet_Code.Stack;

import java.util.Stack;

public class SortStack {
    public static void sort(Stack<Integer>s1){
        Stack<Integer>s2=new Stack<>();
        while (!s1.empty()){
            int x=s1.pop();
            while(!s2.empty()&&s2.peek()>x){
                s1.push(s2.pop());
            }
            s2.push(x);
        }
        while (!s2.empty()){
            s1.push(s2.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.push(1);
        s.push(9);
        s.push(5);
        s.push(3);
        s.push(11);
        sort(s);
        System.out.println("Sorted Stack:");
        while (!s.empty()){
            System.out.println(s.pop());
        }
    }
}
