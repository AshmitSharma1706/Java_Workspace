package Oop.Inheritance.SuperKeyword.Behaviour_of_Constructor.Parameterized_Constructor;

public class UseManager1 {
    public static void main(String[] args) {
        Manager1 boss=new Manager1("Ashmit Sharma",80000.00,50000.00);
        System.out.println("Name of Boss is: "+boss.getName());
        System.out.println("Salary of Boss is: "+boss.getSal());
        System.out.println("Bonus of the Boss is: "+boss.getBonus());
        System.out.println("Total Income of Boss is: "+boss.totalIncome());
    }
}
