package Oop.Inheritance.SuperKeyword.Behaviour_of_Constructor.Parameterized_Constructor;

public class Manager1 extends Emp1{
    private double bonus;

    public Manager1(String name , double sal, double bonus){
        super(name,sal);
        this.bonus=bonus;
    }
    public double getBonus(){
        return bonus;
    }
    public double totalIncome(){
        double total= getSal()+bonus;
        return total;
    }
}
