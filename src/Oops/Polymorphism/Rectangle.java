package Oops.Polymorphism;

public class Rectangle extends Shape{
    private int lenght,breadth;
    public Rectangle(int lenght,int breadth){
        this.lenght=lenght;
        this.breadth=breadth;
    }
    public double area() {
        double ar=lenght*breadth;
        return ar;
    }
}
