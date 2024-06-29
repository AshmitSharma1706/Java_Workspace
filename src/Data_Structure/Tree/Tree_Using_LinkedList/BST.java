package Data_Structure.Tree.Tree_Using_LinkedList;

import java.util.Stack;

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
    public void preorder(){
        if(root==null){
            System.out.println("Tree is empty..!");
            return;
        }
        Stack<Node> st=new Stack<>();
        Node temp=root;
        st.push(root);
        while (!st.empty()){
            temp=st.pop();
            while (temp!=null){
                System.out.println(temp.getData());
                if (temp.getRight()!=null){
                    st.push(temp.getRight());
                }
                temp=temp.getLeft();
            }
        }
    }
    public void preorder2(){
        if(root==null){
            System.out.println("Tree is empty..!");
            return;
        }
        Stack<Node> st=new Stack<>();
        Node temp=root;
        while (true){
            System.out.println(temp.getData());
            if(temp.getRight()!=null){
                st.push(temp.getRight());
            }
            temp=temp.getLeft();
            if(temp==null){
                if(st.empty()){
                    break;
                }
                temp=st.pop();
            }
        }
    }
    public void inorder(){
        if(root==null){
            System.out.println("Tree is empty..!");
            return;
        }
        Stack<Node> st=new Stack<>();
        Node temp=root;
        while(temp!=null || !st.empty()){
            while (temp!=null){
                st.push(temp);
                temp=temp.getLeft();
            }
            temp=st.pop();
            System.out.println(temp.getData());
            temp=temp.getRight();
        }
    }
    public void postorder(){
        if(root==null){
            System.out.println("Tree is empty..!");
            return;
        }
        Stack<Node> st=new Stack<>();
        Node temp=root;
        while(temp!=null || !st.empty()){
            while (temp!=null){
                st.push(temp);
                if(temp.getRight()!=null){
                    temp.getRight().setFlag(-1);
                    st.push(temp.getRight());
                }
                temp=temp.getLeft();
            }
            temp=st.pop();
            if(temp.getFlag()==0){
                System.out.println(temp.getData());
                temp=null;
            }else {
                temp.setFlag(0);
            }
        }
    }
}
