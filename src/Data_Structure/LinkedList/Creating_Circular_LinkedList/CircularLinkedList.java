package Data_Structure.LinkedList.Creating_Circular_LinkedList;

import Data_Structure.LinkedList.Creating_Own_LinkedList_2.Node;

public class CircularLinkedList {
    private Node head;

    public void addAtLast(int x){
        Node p=new Node(x);
        if(head==null){
            head=p;
            p.setNext(p);
            return;
        }
        Node temp=head;
        while (temp.getNext()!=head){
            temp=temp.getNext();
        }
        temp.setNext(p);
        p.setNext(head);
    }
    public void printList(){
        if(head==null){
            System.out.println("List is empty..!");
            return;
        }
        Node temp=head;
        do {
            System.out.println(temp.getData());
            temp=temp.getNext();
        }while (temp!=head);

    }
    public void prepend(int x){
        Node p=new Node(x);
        if(head==null){
            head=p;
            p.setNext(p);
            return;
        }
        Node temp=head;
        while (temp.getNext()!=head){
            temp=temp.getNext();
        }
        p.setNext(head);
        head=p;
        temp.setNext(p);
    }
}
