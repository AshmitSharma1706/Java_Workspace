package Oops.Constructor_Overloading;

public class Box {
    private int l;
    private int b;
    private int h;
    public Box(){
        l=0;
        b=0;
        h=0;
    }
    public Box(int s){
        l=s;
        b=s;
        h=s;
    }
    public  Box(int i,int j,int k){
        l=i;
        b=j;
        h=k;
    }
    public Box(Box p){
        l=p.l;
        b=p.b;
        h=p.h;
    }
    public void show(){
        System.out.println("Length is: "+l+", Breadth is: "+b+", Height is: "+h);
    }
}
