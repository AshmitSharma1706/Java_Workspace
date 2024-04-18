package Oops.Exception_Handling.ObtainingDetailsOfTheException.UsingPublicString_getMessage;

public class DivideAndSum {
    public static void main(String[] args) {
        System.out.println("Enter any two integer.");
        int a=0;                    //This program accepts input from command line arguments.
        int b=0;                    //Should be written in notepad and run on command prompt.
        try {
            a=Integer.parseInt(args[0]);
            b=Integer.parseInt(args[1]);
            int c = a / b;
            System.out.println("The division is: "+c);
        }
        catch (Exception ex){
            System.out.println("Some problem occurred!!! "+ex.getMessage());
        }
        int d=a+b;
        System.out.println("The sum is "+d);
    }
}
