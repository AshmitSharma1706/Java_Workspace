package Leet_Code;

import Oops.Array.Array;

import java.util.ArrayList;
import java.util.List;

public class Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        int [] test={1,1,2};
        System.out.println(removeDuplicates(test));
    }
    public static int removeDuplicates(int[] nums) {
        int count=0;
        for (int i=0; i<nums.length; i++) {
            if(i< nums.length-1 && nums[i]==nums[i+1]){
                continue;
            }
            else {
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
}
