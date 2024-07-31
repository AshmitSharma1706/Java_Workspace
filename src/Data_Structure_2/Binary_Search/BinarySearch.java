package Data_Structure_2.Binary_Search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] num={-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        System.out.println(search(num,22));
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
        return -1;
    }
}
