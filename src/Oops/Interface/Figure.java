package Oops.Interface;

public interface Figure {
    String getName();
    void getArea();
    default void getVolume(){
        System.out.println("Volume not found");
    }

}
