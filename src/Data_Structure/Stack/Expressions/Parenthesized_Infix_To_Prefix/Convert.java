package Data_Structure.Stack.Expressions.Parenthesized_Infix_To_Prefix;

import java.util.Stack;

public class Convert {
    private final String infix;
    private String prefix;

    public Convert(String infix) {
        this.infix = infix;
        prefix ="";
    }
    public void toPrefix(){
        Stack<Character> st=new Stack<>();
        for(int i=infix.length()-1; i>=0; i--){
            char ch=infix.charAt(i);
            if(ch==')'){
                st.push(ch);
            }
            else if(ch=='('){
                while (st.peek()!=')'){
                    prefix+=st.pop();
                }
                st.pop();
            }
            else if (isOperand(ch)){
                prefix = prefix +ch;
            }
            else {
                while (!st.isEmpty()){
                    if(st.peek()==')'){
                        break;
                    }
                    boolean check=precedence(ch) >= precedence(st.peek());
                    if(check)
                        break;
                    prefix = prefix +st.pop();
                }
                st.push(ch);
            }
        }
        while (!st.empty()){
            prefix = prefix +st.pop();;
        }
        StringBuilder sb=new StringBuilder(prefix);
        sb.reverse();
        prefix=sb.toString();
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
        return "Infix=" + infix + "\nPrefix=" + prefix;
    }
}
