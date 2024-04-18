package Practical_Sessions.Loops;

import java.util.Scanner;

public class FirstLastDigit {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter any number:");
        int n=kb.nextInt();
        int l=n%10;
        int f=0;
        while(n>=10){
            n=n/10;
        }
        f=n;
        System.out.println("First digit is:"+f);
        System.out.println("Last digit is:"+l);
    }
}
