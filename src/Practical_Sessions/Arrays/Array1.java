package Practical_Sessions.Arrays;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter the no. of elements you want to store in an array: ");
        int n=kb.nextInt();
        int [] arr=new int[n];
        System.out.print("Enter "+n+" numbers:");
        int i;
        for(i=0; i<n; i++) {
            arr[i]=kb.nextInt();
        }
        System.out.print("The values you have entered: ");
        for(i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("What is your Target value:");
        int t=kb.nextInt();
        for(i=0; i<n; i++){
            if(t==arr[i]){
                System.out.println("True");
                break;
            }
        }
        if(i >= arr.length){
            System.out.println("False");
        }
    }
}
