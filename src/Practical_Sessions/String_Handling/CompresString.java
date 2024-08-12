package Practical_Sessions.String_Handling;

public class CompresString {
    public static void main(String[] args) {
        String str="aaabbbcdd";
        System.out.println(compress(str));
    }
    public static String compress(String str){
        StringBuffer sb=new StringBuffer();
        int i=0;
        while(i<str.length()){
            char ch=str.charAt(i);
            int count=0;
            while (i<str.length() && str.charAt(i)==ch){
                count++;
                i++;
            }
            sb.append(ch);
            if(count>=2){
                sb.append(count);
            }
        }
        return sb.toString();
    }
}
