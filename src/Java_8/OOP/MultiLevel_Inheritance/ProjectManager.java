package Java_8.OOP.MultiLevel_Inheritance;

public class ProjectManager extends Manager{
    private int projectCount;

    public ProjectManager(int id, String name, double salary, double bonus, int projectCount) {
        super(id, name, salary, bonus);
        this.projectCount = projectCount;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary()+(projectCount * 5000);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of projects:"+projectCount);
        System.out.println("Project Manager's total sal:"+calculateSalary());
    }
}
