package Oop.Interface;

public class UseFigure1 {
    public static void main(String[] args) {
        Figure1.message();

        Figure1 f;

        f=new RectangleFigure1(20,30);
        f.getName();
        f.getArea();
        f.getVolume();

        f=new CylinderFigure1(20,30);
        f.getName();
        f.getArea();
        f.getVolume();
    }
}
