package Oops.String_Handling_In_Java.String.StringMethods.public_int_compareToIgnoreCase;

public class ascii {
    public static void main(String[] args) {
        String city1=new String("Bhopal");
        String city2=new String("Bhopal");
        String city3=new String("bhopal");
        System.out.println(city1.compareToIgnoreCase(city2));
        System.out.println(city1.compareToIgnoreCase(city3));
    }
}
