package Data_Structure.LinkedList.Creating_Own_DoublyLinkedList;

public class UseDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList dll=new DoublyLinkedList();
        dll.printList();
        dll.addAtLast(10);
        dll.addAtLast(20);
        dll.prepend(30);
        dll.prepend(40);
        System.out.println("After add elements...");
        dll.printList();
        System.out.println("Reverse List:");
        dll.printReverse();
        System.out.println("Removed "+dll.removeFirst());
        dll.printList();
        System.out.println("Removed "+dll.removeLast());
        dll.printList();
    }
}
