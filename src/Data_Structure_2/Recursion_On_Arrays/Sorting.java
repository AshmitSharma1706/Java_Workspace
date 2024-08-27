package Data_Structure_2.Recursion_On_Arrays;

public class Sorting {
    public static void main(String[] args) {
        int [] arr={1,2,3,5,16,8};
        System.out.println(isSorted(arr,0));
    }
    public static boolean isSorted(int [] arr, int index){
        if(index== arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && isSorted(arr,index+1);
    }
}