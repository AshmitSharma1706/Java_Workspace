package Data_Structure.Stack.Expressions.Infix_To_Postfix;

import java.util.Stack;

public class Convert2 {
    private final String infix;
    private String postfix;

    public Convert2(String infix) {
        this.infix = infix;
        postfix="";
    }
    public void toPostfix(){
        Stack<Character> st=new Stack<>();
        for(int i=0; i<infix.length(); i++){
            char ch=infix.charAt(i);
            if (isOperand(ch)){
                postfix=postfix+ch;
            }
            else {
                while (!st.isEmpty()){
                    boolean check=precedence(ch, st.peek());
                    if(check)
                        break;
                    postfix=postfix+st.pop();
                }
                st.push(ch);
            }
        }
        while (!st.empty()){
            postfix=postfix+st.pop();;
        }
    }
    public boolean isOperand(char ch) {
        return ch >= 48 && ch <= 57 || ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122;
    }
    public boolean precedence (char op1,char op2){
        if (op2=='$')
            return false;
        else if(op1=='$')
            return true;
        else if(op2=='/' || op2=='%' || op2=='*')
            return false;
        else if(op1=='/' || op1=='%' || op1=='*')
            return true;
        else if(op2=='+' || op2=='-')
            return false;
        else
            return true;
    }

    @Override
    public String toString() {
        return "Infix=" + infix + "\nPostfix=" + postfix ;
    }
}

