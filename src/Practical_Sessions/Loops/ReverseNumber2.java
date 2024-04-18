package Practical_Sessions.Loops;

import java.util.Scanner;

public class ReverseNumber2 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int rev=0;
        System.out.print("Enter Any number:");
        int n= kb.nextInt();
        while(n>0){
            int rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        System.out.print("Reverse number is:"+rev);
    }
}
