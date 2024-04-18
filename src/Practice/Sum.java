package Practice;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=kb.nextInt();
        System.out.println("Enter second number:");
        int b= kb.nextInt();
        int sum=a+b;
        System.out.println("The sum of these two "+a+", "+b+" number is:"+sum);
    }
}
