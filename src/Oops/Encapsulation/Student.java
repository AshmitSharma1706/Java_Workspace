package Oops.Encapsulation;

public class Student {
    private int roll;
    private char grade;
    private double percent;
    public void setStudent(){
        roll=10;
        grade='A';
        percent=89.3;
    }
    public void showStudent(){
        System.out.println("Roll= "+roll+", Grade= "+grade+", Percent= "+percent);
    }
}
