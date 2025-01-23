package Oop.Inheritance.SimpleInheritance;

public class Manager extends Emp {
    private double bonus;

    public void setBonus(double bonus){
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
