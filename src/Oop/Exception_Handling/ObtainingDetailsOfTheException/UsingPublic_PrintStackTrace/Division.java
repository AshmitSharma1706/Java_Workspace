package Oop.Exception_Handling.ObtainingDetailsOfTheException.UsingPublic_PrintStackTrace;

import java.util.Scanner;

public class Division {
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
            ex.printStackTrace();
        }
    }
}
