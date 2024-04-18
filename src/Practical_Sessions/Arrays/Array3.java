package Practical_Sessions.Arrays;

import java.util.Scanner;

public class Array3 {
    public int maximumWealth(int [][] accounts){
        int richest=0;
        for(int i=0; i<accounts.length; i++){
            int wealth=0;
            for(int j=0; j<accounts[i].length;j++){
                wealth =wealth+accounts[i][j];
            }
            if(richest<wealth){
                richest=wealth;
            }
        }
        return richest;
    }
}
class Person{
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n=kb.nextInt();

        System.out.println("Enter the number of columns:");
        int m=kb.nextInt();

        int [][]arr=new int[2][3];
        for(int i=0; i<n ; i++){
            for (int j=0; j<m;j++){
                System.out.println("Enter value for["+i+"["+j+"]");
                arr[i][j]= kb.nextInt();
            }
        }
        Array3 brr=new Array3();
        brr.maximumWealth(arr);
        System.out.println();
    }
}