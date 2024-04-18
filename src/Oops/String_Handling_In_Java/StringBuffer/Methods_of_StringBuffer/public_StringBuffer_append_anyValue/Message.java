package Oops.String_Handling_In_Java.StringBuffer.Methods_of_StringBuffer.public_StringBuffer_append_anyValue;

public class Message {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Sharma");
        System.out.println("sb1 is: "+sb);
        System.out.println("Length of sb1 is: "+sb.length());
        System.out.println("Capacity of sb1 is: "+sb.capacity());

        sb.append(" Computer");
        System.out.println("sb1 is: "+sb);
        System.out.println("Length of sb1 is: "+sb.length());
        System.out.println("Capacity of sb1 is: "+sb.capacity());

        sb.append(" Academy-");
        System.out.println("sb1 is: "+sb);
        System.out.println("Length of sb1 is: "+sb.length());
        System.out.println("Capacity of sb1 is: "+sb.capacity());

        sb.append(462016);
        System.out.println("sb1 is: "+sb);
        System.out.println("Length of sb1 is: "+sb.length());
        System.out.println("Capacity of sb1 is: "+sb.capacity());
    }
}
