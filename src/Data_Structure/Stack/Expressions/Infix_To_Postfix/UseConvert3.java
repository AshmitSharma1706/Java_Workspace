package Data_Structure.Stack.Expressions.Infix_To_Postfix;

import java.util.Scanner;

public class UseConvert3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a valid Infix expression:");
        String infix=s.next();
        Convert3 con=new Convert3(infix);
        con.toPostfix();
        System.out.println(con);
    }
}
