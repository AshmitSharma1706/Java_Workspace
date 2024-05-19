package Data_Structure.LinkedList.Creating_Own_DoublyLinkedList;

import java.util.NoSuchElementException;

public class DoublyLinkedList {
    private Node head;

    public void addAtLast(int x){
        Node p=new Node(x);
        if (head==null){
            head=p;
            return;
        }
        Node temp=head;
        while (temp.getNext()!=null){
            temp=temp.getNext();
        }
        temp.setNext(p);
        p.setPrev(temp);
    }
    public void printList(){
        if(head==null){
            System.out.println("List is empty..!");
            return;
        }
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.getData());
            temp=temp.getNext();
        }
    }
    public void printReverse(){
        if(head==null){
            System.out.println("List is empty..!");
            return;
        }
        Node temp=head, prev=null;
        while (temp!=null){
            prev=temp;
            temp=temp.getNext();
        }
        while (prev!=null){
            System.out.println(prev.getData());
            prev=prev.getPrev();
        }
    }
    public void prepend(int x){
        Node p=new Node(x);
        if(head==null){
            head=p;
            return;
        }
        p.setNext(head);
        head.setPrev(p);
        head=p;
    }
    public int removeFirst(){
        if(head==null){
            throw new NoSuchElementException("List is empty..!");
        }
        int x= head.getData();
        head=head.getNext();
        if (head.getNext()!=null){
            head.setPrev(null);
        }
        return x;
    }
    public int removeLast(){
        if(head==null){
            throw new NoSuchElementException("List is empty..!");
        }
        int x;
        if(head.getNext()==null){
            x=head.getData();
            head=null;
            return x;
        }
        Node temp=head;
        while (temp.getNext().getNext()!=null){
            temp=temp.getNext();
        }
        x=temp.getNext().getData();
        temp.setNext(null);
        return x;
    }
}
