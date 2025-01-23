package Java_8.OOP.Simple_Inheritance;

public class Sphere extends Circle {
    public double volume(double radius){
        return (4*(Math.PI)*(Math.pow(radius,3)))/3;
    }
}
