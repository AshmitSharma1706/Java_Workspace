package Data_Structure_2.Recursion_On_String;

public class StringProcessing {
    public static void main(String[] args) {
        skip("","abccaddh");
        System.out.println(skip("abccaddh"));
        System.out.println(skipApple("abccappleaddh"));
        System.out.println(skipAppNotApple("abccappaddh"));
        System.out.println(upperCase("abcdef"));
        System.out.println(lowerCase("ABCDEF"));
    }
    public static String upperCase(String s){
        if(s.isEmpty()){
            return "";
        }
        char ch=s.charAt(0);
        ch=(char)(ch-32);
        return ch+upperCase(s.substring(1));
    }
    public static String lowerCase(String s){
        if(s.isEmpty()){
            return "";
        }
        char ch=s.charAt(0);
        ch=(char)(ch+32);
        return ch+lowerCase(s.substring(1));
    }
    public static void skip(String p,String s){
        if(s.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=s.charAt(0);
        if(ch=='a'){
            skip(p,s.substring(1));
        }
        else {
            skip(p+ch,s.substring(1));
        }
    }
    public static String skip(String s){
        if(s.isEmpty()){
            return "";
        }
        char ch=s.charAt(0);
        if(ch=='a'){
            return skip(s.substring(1));
        }
        else {
            return ch+skip(s.substring(1));
        }
    }
    public static String skipApple(String s){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith("apple")){
            return skipApple(s.substring(5));
        }
        else {
            return s.charAt(0)+skipApple(s.substring(1));
        }
    }
    public static String skipAppNotApple(String s){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith("app") && !s.startsWith("apple")){
            return skipAppNotApple(s.substring(3));
        }
        else {
            return s.charAt(0)+skipAppNotApple(s.substring(1));
        }
    }
}
