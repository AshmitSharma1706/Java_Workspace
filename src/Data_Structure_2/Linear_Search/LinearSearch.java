package Data_Structure_2.Linear_Search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums={23,45,1,2,8,19,-3,16,-11,28};
        System.out.println(linearSearchElement(nums,19));
    }
    public static int linearSearch(int[] nums, int target){
        if(nums.length==0){
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static int linearSearchElement(int[] nums, int target){
        if(nums.length==0){
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==target){
                return target;
            }
        }
        return -1;
    }
}
