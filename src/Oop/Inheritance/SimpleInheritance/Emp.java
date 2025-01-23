package Oop.Inheritance.SimpleInheritance;

public class Emp {
    private String name;
    private double sal;

    public void setEmp(String name, double sal){
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
