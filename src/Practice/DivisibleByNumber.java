package Practice;

import java.util.Scanner;

public class DivisibleByNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number :");
        int num=s.nextInt();
        System.out.println("Enter a number to divide :");
        int div=s.nextInt();
        if (num%div==0){
            System.out.println(num+" is divisible by "+div);
        }
        else {
            System.out.println(num+" is not divisible by "+div);
        }

    }
}
