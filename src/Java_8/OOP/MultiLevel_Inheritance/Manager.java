package Java_8.OOP.MultiLevel_Inheritance;

public class Manager extends Employee{
    private double bonus;

    public Manager(int id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }
    public double getTotalSal(){
        return super.calculateSalary()+bonus;
    }
    @Override
    public double calculateSalary() {
        return super.calculateSalary()+bonus;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Manager's bonus:"+bonus);
        System.out.println("Manager's salary:"+this.getTotalSal());
    }
}
