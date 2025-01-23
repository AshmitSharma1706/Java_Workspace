package Oop.String_Handling_In_Java.String.StringMethods.public_boolean_equalsIgnoreCase;

public class CompareString {
    public static void main(String[] args) {
        String city1="Delhi";
        String city2="Delhi";
        String city3="delhi";
        System.out.println("City1 is: "+city1);
        System.out.println("City2 is: "+city2);
        System.out.println("City3 is: "+city3);
        System.out.println(city1.equalsIgnoreCase(city2));
        System.out.println(city1.equalsIgnoreCase(city3));
    }
}
