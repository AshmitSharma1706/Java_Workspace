package Oop.Inheritance.SuperKeyword.Behaviour_of_Constructor.Parameterized_Constructor;

public class UseCylinder {
    public static void main(String[] args) {
        Cylinder cy=new Cylinder(10,20);
        System.out.println("The area of cylinder is:"+cy.area());
        System.out.println("The volume of cylinder is:"+cy.Volume());
    }
}
