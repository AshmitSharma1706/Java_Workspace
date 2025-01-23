package Oop.This_Keyword.ConstructorChaining;

public class Box {
    private int l,b,h;

    public Box() {
        this.l=0;
        this.b=0;
        this.h=0;
    }
    public Box(int s){
        this.l=s;
        this.b=s;
        this.h=s;
    }
    public Box(int l, int b, int h){
        this.l=l;
        this.b=b;
        this.h=h;
    }
    public void show(){
        System.out.println("Length is: "+l+", Breadth is: "+b+", Height is: "+h);
    }
}
