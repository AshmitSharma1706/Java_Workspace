package Data_Structure_2.Binary_Search;

public class Ceiling {
    public static void main(String[] args) {
        int[] num={2,3,5,9,14,16,18};
        System.out.println(search(num,15));
    }
    static int search(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        int start=0;
        int end= arr.length-1;
        while (start<=end){
            int mid=start + (end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if (arr[mid]<target) {
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return start;
    }
}
