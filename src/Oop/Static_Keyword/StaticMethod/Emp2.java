package Oop.Static_Keyword.StaticMethod;

public class Emp2 {
    private int id;
    private int age;
    private String name;
    private static int nextId;

    public Emp2(int a, String n){
        age=a;
        name=n;
        id=nextId++;
    }
    public void show(){
        System.out.println("Name is: "+name+", Age is: "+age+", Id is: "+id);
    }
    public static void showNextId(){
        System.out.println("Id of the next employee will be: "+nextId);
    }
    protected void finalize() {
        --nextId;
    }
}
