package Data_Structure.Expressions.Infix_To_Postfix;

import java.util.Stack;

public class Convert3 {
    private final String infix;
    private String postfix;

    public Convert3(String infix) {
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
                    boolean check=precedence(ch) > precedence(st.peek());
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
    public int precedence (char op){
        if (op=='$')
            return 3;
        else if(op=='/' || op=='%' || op=='*')
            return 2;
        else if(op=='+' || op=='-')
            return 1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "Infix=" + infix + "\nPostfix=" + postfix ;
    }
}
