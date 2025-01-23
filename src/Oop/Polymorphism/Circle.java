package Oop.Polymorphism;

public class Circle extends Shape{
    private int radius;
    public Circle(int radius) {
        this.radius=radius;
    }
    public double area() {
        double ar=Math.PI*Math.pow(radius,2);
        return ar;
    }
}
