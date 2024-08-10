package Data_Structure_2.Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] num={-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        System.out.println(search(num,1,0,num.length-1));
    }
    public static int search(int[] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start+(end-start)/2;
        if(arr[mid]<target){
            return search(arr,target,mid+1,end);
        }
        if(arr[mid]>target){
            return search(arr,target,start,mid-1);
        }
        return mid;
    }
}
