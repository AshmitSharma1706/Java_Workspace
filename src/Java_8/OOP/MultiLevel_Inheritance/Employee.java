package Java_8.OOP.MultiLevel_Inheritance;

public class Employee {
    private int id;
    private String name;
    private double salary;
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double calculateSalary(){
        return salary;
    }

    public void displayDetails() {
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
        System.out.println("Salary:"+salary);
    }
}
