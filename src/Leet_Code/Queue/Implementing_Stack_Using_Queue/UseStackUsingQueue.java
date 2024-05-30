package Leet_Code.Queue.Implementing_Stack_Using_Queue;

public class UseStackUsingQueue {
    public static void main(String[] args) {
        StackUsingQueue st=new StackUsingQueue();
        st.push(10);
        st.push(20);
        System.out.println(st.peek());
        st.push(30);
        st.push(40);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
    }
}
