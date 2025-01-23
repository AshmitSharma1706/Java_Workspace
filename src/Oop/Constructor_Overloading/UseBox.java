package Oop.Constructor_Overloading;

public class UseBox {
    public static void main(String[] args) {
        Box b1=new Box();
        Box b2=new Box(10,20,30);
        Box b3=new Box(10);
        Box b4=new Box(b2);

        b1.show();
        b2.show();
        b3.show();
        b4.show();
    }
}
