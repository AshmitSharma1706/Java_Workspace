package Data_Structure.LinkedList.Application_of_LinkedList.Dynamic_Stack;

public class Node {
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
    }
}
