package Data_Structure_2.Recursion_On_Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int [] arr={5,4,3,2,1};
        sort2(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static int [] sort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid= arr.length/2;
        int[] left=sort(Arrays.copyOfRange(arr,0,mid));
        int[] right=sort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }

    public static int[] merge(int[] first, int[] second) {
        int i=0,j=0,k=0;
        int [] merged=new int[first.length+ second.length];
        while(i < first.length && j < second.length){
            if(first[i]<second[j]){
                merged[k]=first[i];
                i++;
            }
            else {
                merged[k]=second[j];
                j++;
            }
            k++;
        }
        while(i < first.length){
            merged[k]=first[i];
            i++;
            k++;
        }
        while(j < second.length){
            merged[k]=second[j];
            j++;
            k++;
        }
        return merged;
    }
    public static void sort2(int[] arr, int s, int e){
        if(e-s==1){
            return;
        }
        int mid= s + (e-s)/2;
        sort2(arr,s,mid);
        sort2(arr,mid,e);
        merge2(arr,s,mid,e);
    }

    public static void merge2(int[] arr, int s, int m, int e) {
        int i=s,j=m,k=0;
        int [] merged=new int[e-s];
        while(i < m && j < e){
            if(arr[i]<arr[j]){
                merged[k]=arr[i];
                i++;
            }
            else {
                merged[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i < m){
            merged[k]=arr[i];
            i++;
            k++;
        }
        while(j < e){
            merged[k]=arr[j];
            j++;
            k++;
        }
        System.arraycopy(merged, 0, arr, s, merged.length);
    }
}
