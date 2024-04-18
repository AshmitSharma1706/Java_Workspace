package Oops.Method_Overriding;

public class Child extends Parent{
    public void show(int n){
        System.out.println("In show of Child with int arg...! "+n);
    }
    public void show(String n){
        System.out.println("In show of Child with String arg...! "+n);
    }
}
