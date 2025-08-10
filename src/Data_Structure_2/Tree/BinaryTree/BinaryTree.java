package Data_Structure_2.Tree.BinaryTree;

import java.util.Scanner;

public class BinaryTree {
    private static class Node{
       private Node left;
       private Node right;
       private int value;
       public Node(int value) {
            this.value = value;
       }
    }
    private Node root;

    public void insert(Scanner s){
        System.out.println("Enter the value of root node:");
        int value=s.nextInt();
        root=new Node(value);
        constructTree(s,root);
    }

    private void constructTree(Scanner s, Node node) {
        System.out.println("Do you want to enter the left value of "+node.value);
        boolean left=s.nextBoolean();
        if(left){
            System.out.println("Enter the value of left node of "+node.value);
            int leftValue=s.nextInt();
            node.left=new Node(leftValue);
            constructTree(s,node.left);
        }

        System.out.println("Do you want to enter the right value of "+node.value);
        boolean right=s.nextBoolean();
        if(right){
            System.out.println("Enter the value of right node of "+node.value);
            int rightValue=s.nextInt();
            node.right=new Node(rightValue);
            constructTree(s,node.right);
        }
    }
    public void display(){
        show(root," ");
    }

    private void show(Node node, String indent) {
        if(node==null){
            return;
        }
        System.out.println(node.value);
        show(node.left,indent + "\t");
        show(node.right,indent + "\t");
    }
}
