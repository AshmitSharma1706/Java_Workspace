package Oop.Exception_Handling.CheckedException_Throws;

import java.io.IOException;

public class UseUserInput {
    public static void main(String[] args) throws IOException {
        UserInput u=new UserInput();
        u.acceptInt();
        u.acceptChar();
    }
}
