package Oop.Object_Initialization.ConstructorInitialization.Assignment;

public class Worker {
    private int hw;
    private int rph;
    private int sal;
    public Worker(int h, int r)
    {
        hw=h;
        rph=r;
        if(hw<=40) {
            sal=hw*rph;
        }
        else {
            sal=2*hw*rph;
        }
    }
    public void show()
    {
        System.out.println("Working hours of worker is: "+hw);
        System.out.println("Rate of working per hour of worker is: "+rph);
        System.out.println("Salary of worker is: "+sal);
    }
}
