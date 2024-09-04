package Data_Structure_2.Recursion_On_Permutation;

import java.util.ArrayList;
import java.util.List;

public class Dice {
    public static void main(String[] args) {
        diceSum("",4 );
        System.out.println();
        System.out.println(diceSumList("",4));
    }
    public static void diceSum(String process, int target){
        if(target==0){
            System.out.print(process);
            return;
        }
        for (int i = 1; i <= 6 && i<=target; i++) {
            diceSum(process+i,target-i);
        }
    }
    public static void diceSumFace(String process, int target,int face){
        if(target==0){
            System.out.print(process);
            return;
        }
        for (int i = 1; i <= face && i<=target; i++) {
            diceSumFace(process+i,target-i,face);
        }
    }
    public static List<String> diceSumList(String process, int target){
        if(target==0){
            List<String> list=new ArrayList<>();
            list.add(process);
            return list;
        }
        List<String> result=new ArrayList<>();
        for (int i = 1; i <= 6 && i<=target; i++) {
            result.addAll(diceSumList(process+i,target-i));
        }
        return result;
    }
    public static List<String> diceSumFaceList(String process, int target, int face){
        if(target==0){
            List<String> list=new ArrayList<>();
            list.add(process);
            return list;
        }
        List<String> result=new ArrayList<>();
        for (int i = 1; i <= face && i<=target; i++) {
            result.addAll(diceSumFaceList(process+i,target-i,face));
        }
        return result;
    }
}
