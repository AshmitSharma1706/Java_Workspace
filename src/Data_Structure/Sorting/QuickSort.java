package Data_Structure.Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={2,5,11,14,8,9,12,15,6,10000};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr, int low, int high){
        if (low < high){
            int j= partition(arr,low,high);
            sort(arr,low,j);
            sort(arr,j+1,high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int i=low;
        int j=high;
        int pivot=arr[low];
        do{
            do {
                i++;
            }while (arr[i]<=pivot);
            do {
                j--;
            }while (arr[j]>pivot);
            if (i<j){
                swap(arr,i,j);
            }
        }while(i<j);
        swap(arr,j,low);
        return j;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
