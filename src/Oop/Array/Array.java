package Oop.Array;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the no. of elements you want to store in an array:");
        int n=kb.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter "+n+" numbers:");
        for(int i=0; i<n; i++)
        {
            arr[i]=kb.nextInt();

        }
        System.out.println("The value you have inputted are:");
        int sum=0;
        for(int i=0; i<n; i++)
        {
            System.out.println(+arr[i]);
            sum+=arr[i];

        }
        System.out.println("sum of all element is:"+sum);
        System.out.println("The Average is:"+(float)sum/n);

    }
}
