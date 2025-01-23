package Oop.Interface;

public class MyClass implements MyInterface3 {
    @Override
    public void show() {
        System.out.println("In show of MyClass");
    }

    @Override
    public void display() {
        System.out.println("In display of MyClass");
    }
}
