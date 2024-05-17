package Data_Structure.LinkedList.Creating_Circular_LinkedList;

import Data_Structure.LinkedList.Creating_Own_LinkedList_2.Node;

import java.util.NoSuchElementException;

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
    public int removeFirst(){
        if(head==null){
            throw new NoSuchElementException("List is empty..!");
        }
        int x= head.getData();
        if (head.getNext()==null){
            head=null;
            return x;
        }
        Node temp=head;
        while (temp.getNext()!=null){
            temp=temp.getNext();
        }
        head=head.getNext();
        temp.setNext(head);
        return x;
    }
    public int removeLast(){
        if(head==null){
            throw new NoSuchElementException("List is empty..!");
        }
        int x;
        if (head.getNext()==null){
            x= head.getData();
            head=null;
            return x;
        }
        Node temp=head;
        while (temp.getNext().getNext()!=head){
            temp=temp.getNext();
        }
        x=temp.getNext().getData();
        temp.setNext(head);
        return x;
    }
    public boolean removeData(int x){
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }
        if(head.getData()==x){
            if(head.getNext()==head){
                head=null;
                return true;
            }
            Node temp=head; while(temp.getNext()!=head){
                temp=temp.getNext();
            }
            head=head.getNext();
            temp.setNext(head);
            return true;
        }
        Node temp=head,prev=null;
        while(temp.getNext()!=head && temp.getData()!=x){
            prev=temp;
            temp=temp.getNext();
        }
        if(temp.getData()==x){
            prev.setNext(temp.getNext());
            return true;
        }
        return false;
    }
}
