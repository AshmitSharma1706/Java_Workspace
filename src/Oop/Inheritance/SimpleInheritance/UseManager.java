package Oop.Inheritance.SimpleInheritance;

public class UseManager {
    public static void main(String[] args) {
        Manager boss=new Manager();
        boss.setEmp("Ashmit",60000.00);
        boss.setBonus(50000.00);
        System.out.println("Name of Boss is: "+boss.getName());
        System.out.println("Salary of Boss is: "+boss.getSal());
        System.out.println("Bonus of the Boss is: "+boss.getBonus());
        System.out.println("Total Income of Boss is: "+boss.totalIncome());
    }
}
