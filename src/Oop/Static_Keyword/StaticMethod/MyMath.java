package Oop.Static_Keyword.StaticMethod;

public class MyMath {
    public static void add(int a, int b){
        int c=a+b;
        System.out.println("Sum is: "+c);
    }
    public static void max(int a, int b){
        if(a>b){
            System.out.println("Greater number is: "+a);
        }
        else{
            System.out.println("Greater number is: "+b);
        }
    }
}
