package Data_Structure.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={2,5,11,14,8,9,12,15,6,92};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void sort(int[]arr){
        int i,j,temp,min;
        for(i=0;i<arr.length-1;i++){
            min=i;
            for(j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            if(min!=i){
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }
}
