package Java_8.OOP.MultiLevel_Inheritance;

public class UseEmployee {
    public static void main(String[] args) {
        Employee e=new Employee(101,"Anubhav",50000.0);
        Manager m=new Manager(102,"Bhavika",50000.0,20000.0);
        ProjectManager pm=new ProjectManager(103,"Ashmit",50000.0,20000.0,10);
        System.out.println("Emp Details");
        e.displayDetails();
        System.out.println("===================");
        System.out.println("Manager's Details");
        m.displayDetails();
        System.out.println("===================");
        System.out.println("Project Manager's Details");
        pm.displayDetails();
        System.out.println("===================");
    }
}
