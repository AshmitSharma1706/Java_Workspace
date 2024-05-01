package Data_Structure.LinkedList.Creating_Own_LinkedList_2;

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
}
