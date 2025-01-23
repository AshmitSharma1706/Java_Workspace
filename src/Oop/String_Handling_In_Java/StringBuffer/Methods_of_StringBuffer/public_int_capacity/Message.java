package Oop.String_Handling_In_Java.StringBuffer.Methods_of_StringBuffer.public_int_capacity;

public class Message {
    public static void main(String[] args) {
        StringBuffer sb1=new StringBuffer();
        System.out.println("sb1 is: "+sb1);
        System.out.println("Length of sb1 is: "+sb1.length());
        System.out.println("Capacity of sb1 is: "+sb1.capacity());

        StringBuffer sb2=new StringBuffer(50);
        System.out.println("sb2 is: "+sb2);
        System.out.println("Length of sb2 is: "+sb2.length());
        System.out.println("Capacity of sb2 is: "+sb2.capacity());

        StringBuffer sb3=new StringBuffer("Hello Everyone");
        System.out.println("sb3 is: "+sb3);
        System.out.println("Length of sb3 is: "+sb3.length());
        System.out.println("Capacity of sb3 is: "+sb3.capacity());
    }
}
