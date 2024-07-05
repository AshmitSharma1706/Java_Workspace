package Data_Structure.Tree.Tree_Using_Array.Threaded_Binary_Tree;

public class ThreadedBinaryTree {

    private Node root;
    public Node getLeftMostNode(Node p){
        if (p==null)
            return null;
        while (p.getLeft()!=null){
            p=p.getLeft();
        }
        return p;
    }

    public void inorderTbt(){
        Node temp=getLeftMostNode(root);
        while (temp!=null){
            System.out.println(temp.getData());
            if(temp.getFlag()==1){
                temp=temp.getRight();
            }
            else {
                temp=getLeftMostNode(temp.getRight());
            }
        }
    }
}
