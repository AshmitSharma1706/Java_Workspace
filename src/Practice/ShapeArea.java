package Practice;

public class ShapeArea {
    public static void main(String[] args) {
        double circle=areaOfCircle(7);
        double square=areaOfSquare(7);
        double rectangle=areaOfRectangle(7,10);
        System.out.println(circle);
        System.out.println(square);
        System.out.println(rectangle);
        maxAreaOf(circle,square,rectangle);
    }
    public static double areaOfCircle(double radius){
        return Math.PI*(radius)*(radius);
    }
    public static double areaOfSquare(double side){
        return (side)*(side);
    }
    public static double areaOfRectangle(double l, double b){
        return (l)*(b);
    }
    public static void maxAreaOf(double circle, double square, double rectangle){
        if (circle>square && circle>rectangle){
            System.out.println("Circle has greater area");
        } else if (circle<square && rectangle<square) {
            System.out.println("Square has greater area");
        }
        else {
            System.out.println("Rectangle has greater area");
        }
    }
}
