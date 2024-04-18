package Data_Structure.Expressions.Infix_To_Postfix;

import java.util.Scanner;

public class UseConvert2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a valid Infix expression:");
        String infix=s.next();
        Convert2 con=new Convert2(infix);
        con.toPostfix();
        System.out.println(con);
    }
}
