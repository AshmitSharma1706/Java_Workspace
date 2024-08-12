package Data_Structure.Searching;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={2,5,6,8,9,11,12,14,15,92};
        System.out.println(Arrays.toString(arr));
        System.out.println(search(arr,14));
    }
    public static int search(int[] arr, int x){
        int low=0, high=arr.length-1, mid;
        while (low<=high){
            mid=(low+high)/2;
            if(arr[mid]==x){
                return mid;
            }
            if (arr[mid]<x) {
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return -1;
    }
}
