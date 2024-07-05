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
    public static int [] reducedArray(int [] arr){
        if(arr.length==0){
            throw new IllegalArgumentException("Array size is 0..!");
        }
        int [] reduced= new int[arr.length-1];
        for (int i=1; i<=reduced.length; i++){
            reduced[i]=arr[1];
        }
        return reduced;
    }
    public static void deleteRoot(int [] arr,int size){
        int parIndex=1,childIndex=size;
        arr[parIndex]=arr[childIndex];
        int [] reduced= reducedArray(arr);
        if(reduced.length==0){
            System.out.println("No node left in th tree..!");
            return;
        }

    }
}
