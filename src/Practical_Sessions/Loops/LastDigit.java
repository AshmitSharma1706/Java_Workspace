package Practical_Sessions.Loops;

import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter any number:");
        int n=kb.nextInt();
        int l=n%10;
        System.out.println("Last digit is:"+l);

    }
}
