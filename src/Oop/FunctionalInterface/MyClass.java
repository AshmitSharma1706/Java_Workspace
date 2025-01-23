package Oop.FunctionalInterface;

public class MyClass implements MyInterface{
    @Override
    public String getName() {
        return "hello";
    }

    public static void main(String[] args) {
//        MyInterface i=new MyClass();
//        System.out.println(i.getName());

//        use of lambda expression
        MyInterface i=() ->"hello world";
        System.out.println(i.getName());
    }
}
