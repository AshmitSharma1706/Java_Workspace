package Java_8.Functional_Interface.Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Example2 {
    public static void main(String[] args) {
        List<Employee> empList= Arrays.asList(
                new Employee("Sumit",4,50000.0),
                new Employee("Vikas",8,150000.0),
                new Employee("Deepak",2,40000.0),
                new Employee("Ankit",6,100000.0),
                new Employee("Arjun",1,20000.0),
                new Employee("Rakesh",0,10000.0));

        Function<Employee,Character> function=emp->{
            if(emp.getProjectCount()>5){
                return 'A';
            }
            else if(emp.getProjectCount()>=3 && emp.getProjectCount()<=5){
                return 'B';
            }
            else if(emp.getProjectCount()>=1 && emp.getProjectCount()<=2) {
                return 'C';
            }
            else {
                return 'D';
            }
        };
        for (Employee e:empList){
            System.out.println(function.apply(e));
        }
    }
}

class Employee{
    private String name;
    private int projectCount;
    private double salary;

    public Employee(String name, int projectCount, double salary) {
        this.name = name;
        this.projectCount = projectCount;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProjectCount() {
        return projectCount;
    }

    public void setProjectCount(int projectCount) {
        this.projectCount = projectCount;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee detail ->" + "name='" + name + ", projectCount=" + projectCount +
                ", salary=" + salary;
    }
}
