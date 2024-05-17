package Data_Structure.LinkedList.Creating_Own_LinkedList_2;

public class UseLinkedList {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.printList();
        System.out.println("After inserting elements.");
        list.insert(7);
        list.insert(3);
        list.insert(12);
        list.insert(9);
        list.printList();
        System.out.println("After removing 2..!");
        list.remove(2);
        list.printList();
        System.out.println("After removing 9..!");
        list.remove(9);
        list.printList();
    }
}
