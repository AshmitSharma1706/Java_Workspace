package Oops.Polymorphism;

public class Triangle extends Shape{
    private int base,height;
    public Triangle(int base,int height){
        this.base=base;
        this.height=height;
    }
    public double area() {
        double ar=0.5*base*height;
        return ar;
    }
}
