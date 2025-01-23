package Oop.Inheritance.SuperKeyword.Behaviour_of_Constructor.Parameterized_Constructor;

public class Emp1 {
    private String name;
    private double sal;

    public Emp1(String name, double sal){
        this.name=name;
        this.sal=sal;
    }
    public String getName(){
        return name;
    }
    public double getSal(){
        return sal;
    }
}
