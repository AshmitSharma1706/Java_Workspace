package Oop.This_Keyword;

public class Emp {
    private int age;
    private String name;
    private Double sal;

    public Emp(int age, String name, Double sal){
        this.age=age;
        this.name=name;
        this.sal=sal;
    }
    public  void show(){
        System.out.println("Age is: "+age+", Name is: "+name+", Salary is: "+sal);
    }
}
