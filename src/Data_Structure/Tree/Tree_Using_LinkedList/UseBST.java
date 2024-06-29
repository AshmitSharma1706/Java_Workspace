package Data_Structure.Tree.Tree_Using_LinkedList;

public class UseBST {
    public static void main(String[] args) {
        BST bst=new BST();
        bst.append(10);
        bst.append(15);
        bst.append(12);
        bst.append(8);
        bst.append(5);
        System.out.println("Binary Search Tree Created..!");
        bst.preorder();
        System.out.println("Binary Search Tree Traversed in preorder..!");
        bst.inorder();
        System.out.println("Binary Search Tree Traversed in inorder..!");
        bst.postorder();
        System.out.println("Binary Search Tree Traversed in postorder..!");
    }
}
