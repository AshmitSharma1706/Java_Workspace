package Oops.Exception_Handling.TryAndCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideAndSum {
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
        catch (InputMismatchException i){
            System.out.println("Please enter valid input!!!");
            System.exit(0);
        }
        catch (ArithmeticException ar){
            System.out.println("Denominator(b) should not be 0 ");
        }
        int d=a+b;
        System.out.println("The sum is "+d);
    }
}
