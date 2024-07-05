package Data_Structure.Stack.Expressions.Infix_To_Postfix;

import java.util.Stack;

public class Convert1 {
    private final String infix;
    private String postfix;

    public Convert1(String infix) {
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
    public boolean precedence(char op1,char op2){
        int first,second;

        if(op1=='(' || op1==')'){
            first=4;
        } else if (op1=='$') {
            first=3;
        } else if (op1=='/' || op1=='*' || op1=='%') {
            first=2;
        }else if(op1=='+' || op1=='-'){
            first=1;
        }else {
            first=0;
        }

        if(op2=='(' || op2==')'){
            second=4;
        } else if (op2=='$') {
            second=3;
        } else if (op2=='/' || op2=='*' || op2=='%') {
            second=2;
        }else if(op2=='+' || op2=='-'){
            second=1;
        }else {
            second=0;
        }
        return first > second ;
    }

    @Override
    public String toString() {
        return "Infix=" + infix + "\nPostfix=" + postfix ;
    }
}
