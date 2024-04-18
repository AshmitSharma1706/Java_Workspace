package Oops.Argument_Passing.ReturningArrayFromMethod;

import java.util.Scanner;

public class UseReturnArray {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int[]arr=new int[5];
        System.out.println("Enter 5 values:");
        for(int i=0; i<5; i++){
            arr[i]= kb.nextInt();
        }
        ReturnArray obj=new ReturnArray();
        double[]ans;
        ans=obj.calculate(arr);
        System.out.println("The sum is: "+ans[0]);
        System.out.println("The Average is: "+ans[1]);
    }
}
