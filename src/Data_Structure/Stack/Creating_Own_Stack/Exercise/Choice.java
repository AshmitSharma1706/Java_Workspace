package Data_Structure.Stack.Creating_Own_Stack.Exercise;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Choice {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Stack<Integer> myStack=new Stack<>();
        int choice;
        do {
            System.out.println("Select an option:\n1.Push\n2.Pop\n3.Peek\n4.Quit\nEnter your choice: ");
            choice=s.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter the element to Push: ");
                    int x = s.nextInt();
                    myStack.push(x);
                    System.out.println("Pushed: " + x);
                    break;
                case 2:
                    try{
                        x = myStack.pop();
                        System.out.println("Popped: " + x);
                    }catch (EmptyStackException se){
                        System.out.println("Stack Underflow..!");
                    }
                    break;
                case 3:
                    try{
                        x = myStack.peek();
                        System.out.println("Top element of Stack is: " + x);
                    }catch (EmptyStackException se){
                        System.out.println("Stack Underflow..!");
                    }
                    break;
                case 4:
                    System.out.println("Thank you..!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong Choice. Try again..!");
                    break;
            }
        }while (choice>0);
    }
}
