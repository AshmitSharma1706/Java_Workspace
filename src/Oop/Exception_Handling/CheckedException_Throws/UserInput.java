package Oop.Exception_Handling.CheckedException_Throws;

import java.io.IOException;
import java.util.Scanner;

public class UserInput {
    public void acceptInt(){
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter any integer number:");
        int a= kb.nextInt();
        System.out.println("You entered: "+a);
    }
    public void acceptChar() throws IOException {
        char ch;
        System.out.println("Enter any character:");
        ch=(char) System.in.read();
        System.out.println("You entered: "+ch);
    }
}
