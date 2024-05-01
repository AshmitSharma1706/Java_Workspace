package Data_Structure.LinkedList.Creating_Own_LinkedList_2;

public class UseLinkedList {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.printList();
        System.out.println("Total count: "+list.count());
        System.out.println(list.search(10));
        list.add(10);
        list.add(20);
        System.out.println(list.search(30));
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list.search(30));
        list.printList();
        System.out.println("Total count: "+list.count());
    }
}
