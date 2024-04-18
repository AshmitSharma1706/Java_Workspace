package Oops.Exception_Handling.ObtainingDetailsOfTheException.UsingPublicString_toString;

public class Person {
    private int age;
    private String name;
    public Person(int age,String name){
        this.age=age;
        this.name=name;
    }

    @Override
    public String toString() {
        return age+", "+name;
    }
}
