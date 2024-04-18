package Oops.Static_Keyword.StaticDataMember.Assignment;

public class Emp {
    private int id;
    private int age;
    private String name;
    private static int nextId;

    public Emp(int a, String n){
        age=a;
        name=n;
        id=nextId++;
    }
    public void show(){
        System.out.println("Name is: "+name+", Age is: "+age+", Id is: "+id);
    }
    public void showNextId(){
        System.out.println("Id of the next employee will be: "+nextId);
    }
}
