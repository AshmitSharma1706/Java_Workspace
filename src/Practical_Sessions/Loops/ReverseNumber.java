package Practical_Sessions.Loops;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter Any number:");
        int n= kb.nextInt();
        while(n>0){
            System.out.print(n%10);
            n=n/10;
        }
    }
}
