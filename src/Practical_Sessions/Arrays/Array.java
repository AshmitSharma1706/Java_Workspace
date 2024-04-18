package Practical_Sessions.Arrays;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter the no. of elements you want to store in an array: ");
        int n=kb.nextInt();
        int [] arr=new int[n];
        System.out.print("Enter "+n+" numbers:");
        for(int i=0; i<n; i++) {
            arr[i]=kb.nextInt();
        }
        System.out.println("The values you have entered:");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
