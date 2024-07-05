package Data_Structure.Stack.Expressions.Infix_To_Prefix;

import java.util.Scanner;

public class UseConvert {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a valid Infix expression:");
        String infix=s.next();
        Convert con=new Convert(infix);
        con.toPrefix();
        System.out.println(con);
    }
}
