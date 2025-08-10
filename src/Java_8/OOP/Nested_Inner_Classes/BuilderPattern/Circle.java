package Java_8.OOP.Nested_Inner_Classes.BuilderPattern;

public class Circle {
    private int radius;
    private Point center;

    public Circle(int x, int y, int radius) {
        center=this.new Point(x,y);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle -> " + "radius=" + radius + ", center=" + center;
    }

    public class Point{
        private int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Point -> " + "x=" + x + ", y=" + y;
        }
    }
}
class UseCircle{
    public static void main(String[] args) {
        System.out.println(new Circle(10,10,7));
    }
}
