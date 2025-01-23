package Oop.Interface;

public class RectangleFigure1 implements Figure1 {
    private int l,b;
    public RectangleFigure1(int l,int b){
        this.l=l;
        this.b=b;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public void getArea() {
        System.out.println("Area of Rectangle is: "+(l*b));
    }
}
