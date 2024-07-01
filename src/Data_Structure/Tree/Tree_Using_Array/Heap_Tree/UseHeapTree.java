package Data_Structure.Tree.Tree_Using_Array.Heap_Tree;

import java.util.Scanner;

public class UseHeapTree {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter no. of element of heap tree.");
        int size= kb.nextInt();
        int [] arr=new int[size+1];
        int i;
        System.out.println("Enter the values of heap tree.");
        for(i=1;i<=size;i++){
            System.out.println("Enter "+i+" value.");
            int x= kb.nextInt();
            HeapTree.insert(arr,x,i);
        }
        System.out.println("Heap tree is:");
        for (i=1;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
