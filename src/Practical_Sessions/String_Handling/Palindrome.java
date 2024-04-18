package Practical_Sessions.String_Handling;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int rev=0;
        int num=0;
        System.out.print("Enter Any number:");
        int n= kb.nextInt();
        num=n;
        while(n>0){
            int rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        if(num==rev){
            System.out.print(num+" is palindrome");
        }
        else{
            System.out.print(num+" is not palindrome");
        }

    }
}
