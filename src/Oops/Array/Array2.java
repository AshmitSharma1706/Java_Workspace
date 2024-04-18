package Oops.Array;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter the number of array elements: ");
        int n= kb.nextInt();
        int[] arr =new int[n];
        for (int i=0; i<n; i++){
            arr[i]= kb.nextInt();
        }
        System.out.println("The array is:");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        if(n<2)
        {
            System.out.println("please enter at least 2 number!!!.");
        }
        else
        {
           int sum=0;
            for(int i=0; i<n; i++)
            {
                sum=sum+arr[i];
            }
            System.out.println("sum is:"+sum);
        }
    }
}
