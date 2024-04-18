package Oops.String_Handling_In_Java.String.StringMethods.ConvertingAnyValueToString;

public class Convert {
    public static void main(String[] args) {
        int n=25;
        String Str;
        Str=String.valueOf(n);
        System.out.println(Str);
        Str=String.valueOf(Math.PI);
        System.out.println(Str);
    }
}
