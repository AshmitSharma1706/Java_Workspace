package Oop.Polymorphism;

public class UsePoly {
    public static void main(String[] args) {
        Parent P;
        P=new Parent();
        P.show();
        P.display();

        P=new Child();
        P.show();
        P.display();
    }
}
