package Oops.Interface;

public class RectangleFigure implements Figure{
    private int l,b;
    public RectangleFigure(int l,int b){
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
