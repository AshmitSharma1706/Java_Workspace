package Data_Structure.LinkedList.Creating_Own_LinkedList_2;

import java.util.NoSuchElementException;
import java.util.Stack;

public class LinkedList {
    private Node head;

    public void add(int x){
        Node p=new Node(x);
        if(head==null){
            head=p;
            return;
        }
        Node temp=head;
        while (temp.getNext()!=null){
            temp= temp.getNext();
        }
        temp.setNext(p);
    }
    public void printList(){
        if(head==null){
            System.out.println("Empty List..!");
        }
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.getData());
            temp=temp.getNext();
        }
    }
    public int count(){
        int count=0;
        Node temp=head;
        while (temp!=null){
            count++;
            temp=temp.getNext();
        }
        return count;
    }
    public int search(int x){
        int position=1;
        if(head ==null){
            return 0;
        }
        Node temp=head;
        while (temp.getData()!=x){
            position++;
            temp=temp.getNext();
            if(temp==null) {
                return -1;
            }
        }
        return position;
    }
    public void prepend(int x){
        Node p=new Node(x);
        p.setNext(head);
        head=p;
    }
    public void printReverse(){
        Stack<Integer> s = new Stack<>();
        Node temp=head;
        while (temp!=null){
            int x= temp.getData();
            s.push(x);
            temp=temp.getNext();
        }
        while (!s.empty()){
            int x=s.pop();
            System.out.println(x);
        }
    }
    public void addAt(int at,int x){
        if(at<0 || at>count()){
            throw new IllegalArgumentException("Invalid position..!");
        }
        Node p=new Node(x);
        if(at==0){
            p.setNext(head);
            head=p;
            return;
        }
        Node temp=head;
        int i=0;
        while (i<at-1){
            i++;
            temp=temp.getNext();
        }
        p.setNext(temp.getNext());
        temp.setNext(p);
    }
    public void insert(int x){
        Node p = new Node(x);
        if (head==null){
            head=p;
            return;
        }
        if(x< head.getData()){
            p.setNext(head);
            head=p;
            return;
        }
        Node temp=head,prev=null;
        while (temp!=null && temp.getData()<x){
            prev=temp;
            temp=temp.getNext();
        }
        prev.setNext(p);
        if (temp != null) {
            p.setNext(temp);
        }
    }
    public void removeFirst(){
        if(head==null){
            System.out.println("List is Empty..!");
            return;
        }
        head=head.getNext();
    }
    public void removeLast(){
        if(head==null){
            System.out.println("List is Empty..!");
            return;
        }
        if(head.getNext()==null){
            head=null;
            return;
        }
        Node temp=head;
        while (temp.getNext().getNext()!=null){
            temp=temp.getNext();
        }
        temp.setNext(null);
    }
    public void remove(int x){
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }
        if(head.getData()==x){
            if(head.getNext()==null){
                head=null;
                return;
            }
            head=head.getNext();
            return;
        }
        Node temp=head,prev=null;
        while(temp.getNext()!=null && temp.getData()!=x){
            prev=temp;
            temp=temp.getNext();
        }
        if(temp.getData()==x){
            prev.setNext(temp.getNext());
            return;
        }
        System.out.println("No such element found..!");
    }
    public void reverse(){
        if(head==null){
            System.out.println("List is Empty..!");
            return;
        }
        Node prev=null, current=head, next;
        while (current!=null){
            next=current.getNext();
            current.setNext(prev);
            prev=current;
            current=next;
        }
        head=prev;
    }
    public void deleteNthNodeFromLast(int pos){
        int count=count();
        if(pos<=0 || pos>count){
            throw new IllegalArgumentException("Invalid position");
        }
        int diff=count-pos;
        int i=1;
        Node temp=head;
        while(i<diff){
            temp=temp.getNext();
            i++;
        }
        if(diff==0){
            head=head.getNext();
        }else{
            temp.setNext(temp.getNext().getNext());
        }
    }
    public Node midNode(){
        if(head==null){
            throw new NoSuchElementException("List is empty..!");
        }
        if(head.getNext()==null){
            return head;
        }
        int count=count();
        Node temp=head;
        int i=1;
        if (count%2==0){
            while (i<(count/2)+1){
                i++;
                temp=temp.getNext();
            }
            return temp;
        }
        while (i<(count+1)/2){
            i++;
            temp=temp.getNext();
        }
        return temp;
    }
    public static Node intersection(LinkedList list1,LinkedList list2){
        if (list1.head==null && list2.head==null){
            throw new NoSuchElementException("Both list are empty..!");
        }
        if (list1.head==null || list2.head==null){
            throw new NoSuchElementException("Either of the lists, is empty..!");
        }
        Node temp1=list1.head, temp2=list2.head;
        while (temp1!=null){
            while (temp2!=null){
                if(temp1==temp2){
                    return temp1;
                }
                temp2=temp2.getNext();
            }
            temp1=temp1.getNext();
        }
        return null;
    }

    public int get(int x){
        if(head ==null){
            return -1;
        }
        if(x>count()){
            return -1;
        }
        Node temp=head;
        for(int i=0; i<=x; i++){
            temp=temp.getNext();
        }
        return temp.getData();
    }

    public void removeAtIndex(int x){
        if (head == null) {
            System.out.println("List is empty..!");
            return;
        }
        if(x==0){
            removeFirst();
        }
        Node temp=head,prev=null;
        for(int i=0; i<=x; i++){
            prev=temp;
            temp=temp.getNext();
        }
        prev.setNext(temp.getNext());
    }
}
