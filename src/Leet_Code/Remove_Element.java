package Leet_Code;

public class Remove_Element {
    public static void main(String[] args) {
        int [] test={3,2,2,3};
        System.out.println(removeElement(test,3));
    }
    public static int removeElement(int[] nums, int val) {
        int count=0;
        for (int i=0; i<nums.length; i++) {
            if(nums[i]!=val){
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
}
