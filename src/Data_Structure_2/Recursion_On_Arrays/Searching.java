package Data_Structure_2.Recursion_On_Arrays;

import java.util.ArrayList;
import java.util.List;

public class Searching {
    public static void main(String[] args) {
        int []arr={2,3,1,4,4,5};
        System.out.println(contains(arr,4,0));
        System.out.println(getIndexOf(arr,4,0));
        System.out.println(getIndexFromLast(arr,4,arr.length-1));
        getAllIndex(arr,4,0);
        System.out.println(list);
        System.out.println(getAllIndex2(arr,4,0,new ArrayList<>()));
        System.out.println(getAllIndex3(arr,4,0));
    }
    public static boolean contains(int [] arr, int target, int index){
        if(index==arr.length-1){
            return false;
        }
        return arr[index]==target || contains(arr,target,index+1);
    }
    public static int getIndexOf(int [] arr, int target, int index){
        if(index==arr.length-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else {
            return getIndexOf(arr,target,index+1);
        }
    }
    public static int getIndexFromLast(int [] arr, int target, int index){
        if(index==-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else {
            return getIndexFromLast(arr,target,index-1);
        }
    }
    static List<Integer> list=new ArrayList<>();
    public static void getAllIndex(int [] arr, int target, int index){
        if(index==arr.length-1){
            return;
        }
        if(arr[index]==target){
            list.add(index);
        }
        getAllIndex(arr,target,index+1);
    }
    public static List<Integer> getAllIndex2(int [] arr, int target, int index, List<Integer> list){
        if(index==arr.length-1){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return getAllIndex2(arr,target,index+1,list);
    }
    public static List<Integer> getAllIndex3(int [] arr, int target, int index){
        List<Integer> list=new ArrayList<>();
        if(index==arr.length-1){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        List<Integer> list2=getAllIndex3(arr,target,index+1);
        list.addAll(list2);
        return list;
    }
}
