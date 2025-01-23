package Oop.String_Handling_In_Java.String.StringMethods.Overriding_equals_method_InOurClass;

public class Box {
    private int l,b,h;

    public Box(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }
    public void show(){
        System.out.println("Length is: "+l+", Breadth is: "+b+", Height is: "+h);
    }
    public boolean equals(Object obj){
        Box b=(Box)obj;
        if(this.l==b.l && this.b==b.b && this.h==b.h){
            return true;
        }
        else {
            return false;
        }
    }
}
