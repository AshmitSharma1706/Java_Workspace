package Data_Structure.Queue.Creating_Circular_Queue;

import java.util.Scanner;

public class UseQueue2 {
    public static void main(String[] args) {
        int choice,x;
        Scanner s=new Scanner(System.in);
        Queue2 obj=new Queue2(5);
        do {
            System.out.println("Select an option:\n1.Enqueue\n2.Dequeue\n3.Peek\n4.Quit\nEnter your choice: ");
            choice=s.nextInt();
            switch (choice) {
                case 1 -> {
                    try {
                        System.out.println("Enter the element to insert: ");
                        x = s.nextInt();
                        obj.enqueue(x);
                        System.out.println("Inserted: " + x);
                    }catch (QueueException qe) {
                        System.out.println(qe.getMessage());
                    }
                }
                case 2 -> {
                    try {
                        x = obj.dequeue();
                        System.out.println("Deleted: " + x);
                    } catch (QueueException qe) {
                        System.out.println(qe.getMessage());
                    }
                }
                case 3 -> {
                    try {
                        x = obj.peek();
                        System.out.println("Top element of Queue is: " + x);
                    } catch (QueueException qe) {
                        System.out.println(qe.getMessage());
                    }
                }
                case 4 -> {
                    System.out.println("Thank you..!");
                    System.exit(0);
                }
                default -> System.out.println("Wrong Choice. Try again..!");
            }
        }while (true);
    }
}
