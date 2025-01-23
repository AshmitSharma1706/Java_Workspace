package Oop.String_Handling_In_Java.StringBuffer.Methods_of_StringBuffer.public_StringBuffer_reverse;

public class Message {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Ashmit");
        System.out.println("sb1 is: "+sb);
        System.out.println("Length of sb1 is: "+sb.length());
        System.out.println("Capacity of sb1 is: "+sb.capacity());

        sb.reverse();
        System.out.println("sb1 is: "+sb);
        System.out.println("Length of sb1 is: "+sb.length());
        System.out.println("Capacity of sb1 is: "+sb.capacity());
    }
}
