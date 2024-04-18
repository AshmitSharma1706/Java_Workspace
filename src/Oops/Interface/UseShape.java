package Oops.Interface;

public class UseShape {
    public static void main(String[] args) {
        Shape s;

        s=new Circle(10);
        System.out.println("The name of shape is: "+s.getName());
        System.out.println("Area is: "+s.getArea());

        s=new Rectangle(10,20);
        System.out.println("The name of shape is: "+s.getName());
        System.out.println("Area is: "+s.getArea());
    }
}
