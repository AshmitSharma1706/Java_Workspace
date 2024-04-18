package Oops.Inheritance.SuperKeyword.Behaviour_of_Constructor.Parameterized_Constructor;

public class Circle {
    private int radius;
    public Circle(int radius){
        this.radius=radius;
    }
    public int getRadius(){
        return radius;
    }

    public double area () {
        double ar=Math.PI*Math.pow(radius,2);
        return ar;
    }
}
