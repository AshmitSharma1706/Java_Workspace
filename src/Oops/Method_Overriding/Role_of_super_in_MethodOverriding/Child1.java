package Oops.Method_Overriding.Role_of_super_in_MethodOverriding;

public class Child1 extends Parent1 {
    public void show(int n){
        System.out.println("In show of Child with int arg...! "+n);
        super.show(n);
    }
    public void show(String n){
        System.out.println("In show of Child with String arg...! "+n);
        super.show(n);
    }
}
