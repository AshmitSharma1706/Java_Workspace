package Oops.Exception_Handling.Throw;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        try{
            System.out.println("Enter any two integer number.");
            System.out.println("First number: ");
            int a= kb.nextInt();
            System.out.println("Second number: ");
            int b= kb.nextInt();
            if(a<=0){
                ArithmeticException ex=new ArithmeticException("Numerator should be positive and not 0.");
                throw ex;
            }
            int c=a/b;
            System.out.println("Division is: "+c);
        }
        catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
    }
}
