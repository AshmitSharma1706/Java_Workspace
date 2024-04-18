package Oops.Inheritance.SuperKeyword.Behaviour_of_Constructor.Parameterized_Constructor;

import Oops.Inheritance.SuperKeyword.Behaviour_of_Constructor.Parameterized_Constructor.Circle;

public class Cylinder extends Circle {
    private int height;
    public Cylinder(int radius,int height){
        super(radius);
        this.height=height;
    }

    @Override
    public double area() {
        double ar=2*super.area()+2*Math.PI*getRadius()*height;
        return ar;
    }
    public double Volume(){
        double vol=super.area()*height;
        return vol;
    }
}
