package Oops.Exception_Handling.CreatingUserDefinedOrCustomException;

import java.util.Scanner;

public class Divide {
    public static void main(String[] args){
        try{
            Scanner kb=new Scanner(System.in);
            System.out.println("Enter any two integer number.");
            System.out.println("First number: ");
            int a= kb.nextInt();
            System.out.println("Second number: ");
            int b= kb.nextInt();
            if(a<=0){
                InvalidNumeratorException ex=new InvalidNumeratorException("Numerator should be positive and not 0.");
                throw ex;
            }
            int c=a/b;
            System.out.println("Division is: "+c);
        }
        catch (ArithmeticException ex) {
            System.out.println(ex);
        }
        catch (InvalidNumeratorException ex){
            System.out.println(ex.getMessage());
        }
    }
}
