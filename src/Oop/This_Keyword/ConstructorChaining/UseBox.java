package Oop.This_Keyword.ConstructorChaining;

public class UseBox {
    public static void main(String[] args) {
        Box b1=new Box();
        Box b2=new Box(20);
        Box b3=new Box(5,10,15);

        b1.show();
        b2.show();
        b3.show();
    }
}
