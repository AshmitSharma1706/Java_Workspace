package Data_Structure.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={2,5,11,14,8,9,12,15,6};
        spilt(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void spilt(int[] arr, int start, int end){
        if(start<end){
            int mid=start + (end-start)/2;
            spilt(arr,start,mid);
            spilt(arr,mid+1,end);
            merge(arr,start,end);
        }
    }

    public static void merge(int[] arr, int start, int end) {
        int mid=start + (end-start)/2;
        int first=start;
        int second=mid+1;
        int pos=0;
        int[] brr=new int[end-start+1];
        while (first<=mid && second<=end){
            if(arr[first]<=arr[second]){
                brr[pos]=arr[first];
                first++;
            }
            else {
                brr[pos]=arr[second];
                second++;
            }
            pos++;
        }
        while(first<=mid){
            brr[pos]=arr[first];
            first++;
            pos++;
        }
        while(second<=end){
            brr[pos]=arr[second];
            second++;
            pos++;
        }
        for (int j = 0, k=start; j < brr.length; j++, k++) {
            arr[k]=brr[j];
        }
    }
}
