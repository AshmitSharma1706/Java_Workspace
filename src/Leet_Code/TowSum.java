package Leet_Code;

import java.util.Arrays;

public class TowSum {
    public static void main(String[] args) {
        int [] brr={3,3};
        int target=6;
        System.out.println(Arrays.toString(TowSum.twoSum(brr,target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j< nums.length; j++){
                if (nums[i]+nums[j]==target){
                    int [] arr={i,j};
                    return arr;
                }
            }
        }
        return null;
    }
}
