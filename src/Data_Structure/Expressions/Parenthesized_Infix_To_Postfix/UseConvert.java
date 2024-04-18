package Data_Structure.Expressions.Parenthesized_Infix_To_Postfix;

import java.util.Scanner;

public class UseConvert {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a valid Infix expression:");
        String infix=s.next();
        Convert con=new Convert(infix);
        con.toPostfix();
        System.out.println(con);
    }
}
