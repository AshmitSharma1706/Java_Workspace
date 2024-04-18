package Data_Structure.Expressions.Evaluating_Postfix;

import java.util.Scanner;

public class UsePostfix {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter a valid Postfix expression:");
        String postfix=kb.next();
        Postfix p=new Postfix(postfix);
        System.out.println("Result: "+p.evaluate());
    }
}
