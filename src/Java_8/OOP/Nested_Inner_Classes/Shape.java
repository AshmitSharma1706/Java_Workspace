package Java_8.OOP.Nested_Inner_Classes;

public class Shape {
    static class Colour{
        private int red, blue, green;

        public Colour(int red, int blue, int green) {
            this.red = red;
            this.blue = blue;
            this.green = green;
        }

        @Override
        public String toString() {
            return "red=" + red + ", blue=" + blue + ", green=" + green;
        }
    }
}
class TestColour{
    public static void main(String[] args) {
        Shape.Colour c1=new Shape.Colour(0,10,10);
        System.out.println(c1);
    }
}