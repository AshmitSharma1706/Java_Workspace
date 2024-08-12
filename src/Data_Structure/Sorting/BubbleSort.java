package Data_Structure.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={2,5,11,14,8,9,12,15,6,92};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){ boolean compare=false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    compare=true;
                }
            }
            if(!compare)
                break;
        }
    }
}
