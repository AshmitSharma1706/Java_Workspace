package Data_Structure.Sorting;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[]arr={0,10,3,11,5,7,12,9,1,6};
        System.out.println("Original array:");
        System.out.println(Arrays.toString(arr));
        for(int i=1;i<=arr.length-1;i++) {
            int x = arr[i];
            insertHeap(arr, i, x);
        }
        System.out.println("Array after converting into Heap");
        System.out.println(Arrays.toString(arr));
        for(int i=arr.length-1;i>=1;i--){
            int x=deleteHeap(arr,i);
            arr[i]=x;
        }
        System.out.println("After sorting");
        System.out.println(Arrays.toString(arr));
    }
    public static void insertHeap(int [] arr,int child, int n){
        int parent;
        while (child>1){
            parent=child/2;
            if(arr[parent]>n){
                arr[child]=n;
                return;
            }
            arr[child]=arr[parent];
            child=parent;
        }
        arr[1]=n;
    }
    public static int deleteHeap(int [] arr,int n){
        int temp;
        int x=arr[1];
        arr[1]=arr[n];
        n--;
        int i=1, j=i*2;
        while (j<=n){
            if (j<n){
                if(arr[j+1]>arr[j]){
                    j+=1;
                }
            }
            if (arr[i]<arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i=j;
                j=i*2;
            }
            else {
                break;
            }
        }
        return x;
    }
}
