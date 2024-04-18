package Oops.Exception_Handling.ObtainingDetailsOfTheException.UsingPublicString_getMessage;

import java.util.Scanner;

public class DivideAndSum1 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter any two integer.");
        int a=0;
        int b=0;
        try {
            System.out.print("Enter first number(a): ");
            a = kb.nextInt();
            System.out.print("Enter second number(b): ");
            b = kb.nextInt();
            int c = a / b;
            System.out.println("The division is: "+c);
        }
        catch (Exception ex){
            System.out.println("Some problem occurred!!! "+ex.getMessage());
        }
        int d=a+b;
        System.out.println("The sum is "+d);
    }
}
