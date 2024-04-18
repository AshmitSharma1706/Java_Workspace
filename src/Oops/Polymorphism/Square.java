package Oops.Polymorphism;

public class Square extends Shape{
    private int side;
    public Square(int side){
        this.side=side;
    }
    public double area() {
        double ar=side*side;
        return ar;
    }
}
