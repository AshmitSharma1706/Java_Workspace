package Oops.Polymorphism;

public class UseShape {
    public static void main(String[] args) {
        Shape s;
        s=new Circle(10);
        System.out.println("The area of circle is:"+s.area());

        s=new Rectangle(10,20);
        System.out.println("The area of rectangle is:"+s.area());

        s=new Square(20);
        System.out.println("The area of square is:"+s.area());

        s=new Triangle(10,20);
        System.out.println("The area of triangle is:"+s.area());;
    }
}
