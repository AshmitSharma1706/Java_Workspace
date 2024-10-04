package Practical_Sessions.Loops;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        List<List<Integer>> triangleList=createTriangle(10);
        printTriangle(triangleList);
    }
    public static List<List<Integer>> createTriangle(int rowNum){
        List<List<Integer>> result= new ArrayList<>();
        if(rowNum==0){
            return result;
        }
        List<Integer> firstRow=new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);
        if(rowNum==1){
            return result;
        }
        for (int i = 1; i < rowNum; i++) {
            List<Integer> prevRow=result.get(i-1);
            List<Integer> newRow=new ArrayList<>();
            newRow.add(1);
            for (int j = 0; j <i-1 ; j++) {
                newRow.add(prevRow.get(j)+prevRow.get(j+1));
            }
            newRow.add(1);
            result.add(newRow);
        }

        return result;
    }

    public static void printTriangle(List<List<Integer>> triangleList){
        for(List<Integer> list: triangleList){
            for(int element: list){
                System.out.print(element+" ");
            }
            System.out.println();
        }
    }
}
