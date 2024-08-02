package Data_Structure_2.Binary_Search;

public class CountRotationInArray {
    public static void main(String[] args) {
        int[] num={4,5,6,7,0,1,2};
        int[] num2={1,2,3,4,5,6,7};
        System.out.println(countRotation(num2));
    }
    public static int countRotation(int[] num) {
        int pivot=getPivot(num);
        return pivot+1;
    }
    public static int getPivotInDuplicates(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start + (end-start)/2;
            if(mid < end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            else if (arr[start]<arr[mid] || arr[start]==arr[mid] && arr[mid]>arr[end]) {
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return -1;
    }
    public static int getPivot(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start + (end-start)/2;
            if(mid < end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
