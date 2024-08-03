package Data_Structure_2.Binary_Search;

import java.util.Arrays;

public class BinarySearchInSorted2DArray {
    public static void main(String[] args) {
        int[][] arr={
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(search(arr, 10)));
    }
    public static int[] binarySearch(int[][] arr, int row, int colStart, int colEnd, int target){
        while (colStart<=colEnd){
            int mid=colStart - (colEnd-colStart)/2;
            if(arr[row][mid]==target){
                return new int[]{row,mid};
            }
            if(arr[row][mid]<target){
                colStart=mid+1;
            }
            else {
                colEnd=mid-1;
            }
        }
        return new int[]{-1,-1};
    }

    public static int[] search(int[][] arr, int target){
        int row=arr.length;
        int col=arr[0].length;
        if(row==1){
            return binarySearch(arr,0,0,col-1,target);
        }
        int rowStart=0;
        int rowEnd=row-1;
        int colMid=col/2;
        while (rowStart < (rowEnd-1)){
            int mid= rowStart + (rowEnd-rowStart)/2;
            if (arr[mid][colMid]==target){
                return new int[]{mid,colMid};
            }
            if(arr[mid][colMid]<target){
                rowStart=mid;
            }
            else {
                rowEnd=mid;
            }
        }
        if (arr[rowStart][colMid]==target){
            return new int[]{rowStart,colMid};
        }
        if (arr[rowStart+1][colMid]==target){
            return new int[]{rowStart+1,colMid};
        }
        if(target<=arr[rowStart][colMid-1]){
            return binarySearch(arr,rowStart,0,colMid-1,target);
        }
        if(target>=arr[rowStart][colMid+1] && target<=arr[rowStart][col-1]){
            return binarySearch(arr,rowStart,colMid+1,col-1,target);
        }
        if(target<=arr[rowStart+1][colMid-1]){
            return binarySearch(arr,rowStart+1,0,colMid-1,target);
        }
        else {
            return binarySearch(arr,rowStart+1,colMid+1,col-1,target);
        }
    }
}
