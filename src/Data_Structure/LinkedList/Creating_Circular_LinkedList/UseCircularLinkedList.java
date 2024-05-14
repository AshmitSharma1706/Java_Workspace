package Data_Structure.LinkedList.Creating_Circular_LinkedList;

public class UseCircularLinkedList {
    public static void main(String[] args) {
        CircularLinkedList cList = new CircularLinkedList();
        cList.printList();
        cList.addAtLast(10);
        cList.addAtLast(20);
        cList.addAtLast(30);
        System.out.println("After adding nodes at last..!");
        cList.printList();
        cList.prepend(40);
        cList.prepend(50);
        cList.prepend(60);
        System.out.println("After adding nodes at first..!");
        cList.printList();
    }
}
