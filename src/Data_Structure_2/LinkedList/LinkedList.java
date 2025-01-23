package Data_Structure_2.LinkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.size = 0;
    }
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    // insert using recursion
//    public void insertRec(int val, int index) {
//        head = insertRec(val, index, head);
//    }
//    private Node insertRec(int val, int index, Node node) {
//        if (index == 0) {
//            Node temp = new Node(val, node);
//            size++;
//            return temp;
//        }
//
//        node.next = insertRec(val, index-1, node.next);
//        return node;
//    }

    public void insertRecursion(int val, int index){
        head=add(val,index,head);
    }
    private Node add(int val, int index, Node node){
        if(index==0){
            Node p=new Node(val,node);
            size++;
            return p;
        }

        node.next=add(val,index-1,node.next);
        return node;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        size--;
        return val;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public void duplicates() {
        Node node = head;

        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }
    public static LinkedList merge(LinkedList list1,LinkedList list2){
        Node l1=list1.head;
        Node l2=list2.head;

        LinkedList m=new LinkedList();
        while (l1!=null && l2!=null){
            if(l1.value < l2.value){
                m.insertLast(l1.value);
                l1=l1.next;
            }
            else {
                m.insertLast(l2.value);
                l2=l2.next;
            }
        }
        while (l1!=null){
            m.insertLast(l1.value);
            l1=l1.next;
        }
        while (l2!=null){
            m.insertLast(l2.value);
            l2=l2.next;
        }
        return m;
    }
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
    public int cycleLength(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        int length=0;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                ListNode temp=slow;
                do {
                    temp=temp.next;
                    length++;
                }while (temp!=slow);
                return length;
            }
        }
        return length;
    }
    public ListNode detectCycle(ListNode head) {
        int length=0;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                length=cycleLength(slow);
                break;
            }
        }
        ListNode f=head;
        ListNode s=head;
        while (length>0){
            s=s.next;
            length--;
        }
        while (f!=s){
            f=f.next;
            s=s.next;
        }
        return s;
    }
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;

        do {
            slow=findSquare(slow);
            fast=findSquare(findSquare(fast));
        }while (slow!=fast);
        if (slow==1){
            return true;
        }
        return false;
    }
    private int findSquare(int num){
        int ans =0;
        while(num > 0){
            int rem=num % 10;
            ans+=rem*rem;
            num=num/10;
        }
        return ans;
    }
    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    //Reversing linkedList using recursion
    public void reverse(Node node){
        if (node==tail){
            head=tail;
            return;
        }
        reverse(node.next);
        tail.next=node;
        tail=node;
        tail.next=null;
    }
}
class ListNode {
      int val;
      ListNode next;
    ListNode() {
    }
      ListNode(int x) {
          val = x;
          next = null;
      }
}
