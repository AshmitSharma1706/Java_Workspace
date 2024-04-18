package Oops.String_Handling_In_Java.String.ConstructorsOfStringClass.publicString_ParameterizedConstructor_charArray;

public class Message {
    public static void main(String[] args) {
        char[]arr={'B','h','o','p','a','l'};
        String Str=new String(arr);
        System.out.println(Str);
        System.out.println(Str.length());
    }
}
