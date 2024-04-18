package Oops.String_Handling_In_Java.String.ConstructorsOfStringClass.publicString_ParameterizedConstructor_charArrayAnd2Int;

public class Message {
    public static void main(String[] args) {
        char[]arr={'S','o','f','t','w','a','r','e'};
        String Str=new String(arr,0,4);
        System.out.println(Str);
        System.out.println(Str.length());
    }
}
