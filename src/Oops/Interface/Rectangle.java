package Oops.Interface;

public class Rectangle implements Shape{
    private int l,b;
    public Rectangle(int l,int b){
        this.l=l;
        this.b=b;
    }

    @Override
    public double getArea() {
        return l*b;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }
}
