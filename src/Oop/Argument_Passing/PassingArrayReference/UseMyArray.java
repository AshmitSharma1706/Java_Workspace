package Oop.Argument_Passing.PassingArrayReference;

import java.util.Scanner;

public class UseMyArray {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int [] arr=new int[5];
        System.out.println("Enter any 5 integer element of array.");
        for(int i=0; i< arr.length;i++){
            arr[i]= kb.nextInt();
        }
        MyArray a=new MyArray();
        System.out.println("Sum is: "+a.calculate(arr));
    }
}
