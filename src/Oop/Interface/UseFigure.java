package Oop.Interface;

public class UseFigure {
    public static void main(String[] args) {
        Figure f;

        f=new RectangleFigure(10,20);
        f.getName();
        f.getArea();
        f.getVolume();

        f=new CylinderFigure(10,20);
        f.getName();
        f.getArea();
        f.getVolume();
    }
}
