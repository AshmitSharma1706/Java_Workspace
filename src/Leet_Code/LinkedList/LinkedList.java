package Leet_Code.LinkedList;

import java.util.NoSuchElementException;

public class LinkedList {
    private Node head;

    public boolean hasCycle(LinkedList list){
        if(head==null){
            System.out.println("List is empty..!");
            return false;
        }
        Node prev=head, next=head.getNext();
        while(prev!=next){
            if(next==null || next.getNext()==null){
                return false;
            }
            prev=prev.getNext();
            next=next.getNext().getNext();
        }
        return true;
    }

}
