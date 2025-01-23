package Oop.Interface;

public interface Figure1 {
    String getName();
    void getArea();
    default void getVolume(){
        System.out.println("Volume not found");
    }
    static void message(){
        System.out.println("Welcome to Mensuration topic in maths.");
    }
}
