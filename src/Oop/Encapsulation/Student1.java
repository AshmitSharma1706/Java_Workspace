package Oop.Encapsulation;

public class Student1 {
    private int roll;
    private String name;
    private double percent;
    public void setStudent(int r,String n,double p){
        roll=r;
        name=n;
        percent=p;
    }
    public void showStudent(){
        System.out.println("Roll= "+roll+", Name= "+name+", Percent= "+percent);
    }
}
