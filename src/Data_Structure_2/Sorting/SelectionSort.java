package Data_Structure_2.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={3,2,5,1,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int lastIndex= arr.length-1-i;
            int maxIndex= getMaxIndex(arr,0,lastIndex);
            swap(arr,maxIndex,lastIndex);
        }
    }

    public static int getMaxIndex(int[] arr, int start, int lastIndex) {
        int max=start;
        for (int i = start; i <=lastIndex; i++) {
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    public static void swap(int[] arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
