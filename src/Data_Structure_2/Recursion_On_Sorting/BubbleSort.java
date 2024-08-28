package Data_Structure_2.Recursion_On_Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr={4,3,2,1};
        sort(arr, arr.length-1,0 );
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int [] arr, int row, int col){
        if(row==0){
            return;
        }
        if(col<row){
            if(arr[col]>arr[col+1]){
                swap(arr,col,col+1);
            }
            sort(arr,row,col+1);
        }
        else {
            sort(arr,row-1,0);
        }
    }
    public static void swap(int[] arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
