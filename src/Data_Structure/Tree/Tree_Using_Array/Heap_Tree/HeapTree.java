package Data_Structure.Tree.Tree_Using_Array.Heap_Tree;

public class HeapTree {
    public static void insert(int [] arr,int x,int i){
        int parIndex,childIndex=i;
        while(childIndex>1){
            parIndex=childIndex/2;
            if(arr[parIndex]>x){
                arr[childIndex]=x;
                return;
            }
            arr[childIndex]=arr[parIndex];
            childIndex=parIndex;
        }
        arr[1]=x;
    }
}
