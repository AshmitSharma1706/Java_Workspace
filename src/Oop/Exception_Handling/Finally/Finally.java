package Oop.Exception_Handling.Finally;

import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        try{
            System.out.println("Enter Any two integer number.");
            System.out.println("First number:");
            int a= kb.nextInt();
            System.out.println("Second number:");
            int b= kb.nextInt();
            int c=a/b;
            System.out.println("Division is: "+c);
        }
        catch (ArithmeticException ae){
            System.out.println("Denominator should not be 0");
        }
        finally {
            System.out.println("Have a Good Day!!!");
        }
    }
}
