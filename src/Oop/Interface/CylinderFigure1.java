package Oop.Interface;

public class CylinderFigure1 implements Figure1{
    private int radius,height;
    public CylinderFigure1(int radius, int height){
        this.radius=radius;
        this.height=height;
    }
    public String getName(){
        return "Cylinder";
    }
    public void getArea(){
        System.out.println("Area of cylinder is: "+(2*Math.PI*Math.pow(radius,2)+2*Math.PI*radius*height));
    }
    public void getVolume(){
        System.out.println("The volume of cylinder is: "+Math.PI*Math.pow(radius,2)*height);
    }
}
