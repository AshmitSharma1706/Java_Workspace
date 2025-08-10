package Java_8.OOP.InstanceOf_Operator;

public class PrintResult {
    public static void display(Shape s){
        if(s instanceof Circle c){
            c.area();
        }
        if(s instanceof Cylinder cy){
            cy.area();
            cy.volume();
        }
    }
}
