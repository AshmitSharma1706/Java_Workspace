package Data_Structure.Searching;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={2,5,11,14,8,9,12,15,6,92};
        System.out.println(Arrays.toString(arr));
        System.out.println(search(arr,14));
    }
    public static int search(int[] arr, int x){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
}
