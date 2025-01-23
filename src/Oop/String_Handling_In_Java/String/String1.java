package Oop.String_Handling_In_Java.String;

public class String1 {
    public static void main(String[] args) {
        String name="Ashmit";     //This creates a String object in heap area and stores "Ashmit" and this is immutable.
        System.out.println(name);
        name+="Sharma";           //This will create a new String object in heap area and stores "AshmitSharma" and this is also immutable.
        System.out.println(name);
    }
}
             //Both the 'name' have different addresses in heap area