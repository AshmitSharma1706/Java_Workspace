package Data_Structure.Tree.Tree_Using_LinkedList;

public class BST {
    private Node root;

    public void append(int data){
        Node p=new Node(data);
        if(root==null){
            root=p;
            return;
        }
        Node temp=root, prev=null;
        while(temp!=null){
            prev=temp;
            if(temp.getData()>data){
                temp=temp.getLeft();
            }else {
                temp=temp.getRight();
            }
        }
        if(prev.getData()>data){
            prev.setLeft(p);
        }
        else {
            prev.setRight(p);
        }
    }
}
