package Data_Structure.LinkedList.Creating_Own_LinkedList_2;

public class UseLinkedList {
    public static void main(String[] args) {
        LinkedList list1=new LinkedList();
        LinkedList list2=new LinkedList();
        System.out.println("List1 is...");
        list1.insert(1);
        list1.insert(2);
        list1.insert(3);
        list1.insert(4);
        list1.insert(5);
        list1.printList();
        System.out.println("List2 is...");
        list2.insert(7);
        list2.insert(6);
        list2.insert(8);
        list2.insert(9);
        list2.insert(10);
        list2.printList();
        Node n=LinkedList.intersection(list1,list2);
        if(n==null){
            System.out.println("No intersecting node found..! "+n);
        }
        list1.reverse();
        list1.printList();

    }
}
