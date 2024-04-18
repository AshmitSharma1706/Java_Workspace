package Oops.Encapsulation;

public class Circle {
    private int radius;
    public void setRadius(int r){
        radius=r;
    }
    public void calculateArea(){
        double area=Math.PI*Math.pow(radius,2);
        System.out.println("Area of circle is: "+area);
    }
    public void calculateCircumference(){
        double cir=2*Math.PI*radius;
        System.out.println("Circumference of circle is: "+cir);
    }
}
