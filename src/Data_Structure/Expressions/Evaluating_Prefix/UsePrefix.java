package Data_Structure.Expressions.Evaluating_Prefix;

import java.util.Scanner;

public class UsePrefix {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter a valid Postfix expression:");
        String prefix=kb.next();
        Prefix p=new Prefix(prefix);
        System.out.println("Result: "+p.evaluate());
    }
}
