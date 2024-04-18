package Data_Structure.Expressions.Infix_To_Postfix;

import java.util.Scanner;

public class UseConvert1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a valid Infix expression:");
        String infix=s.next();
        Convert1 con=new Convert1(infix);
        con.toPostfix();
        System.out.println(con);
    }
}
