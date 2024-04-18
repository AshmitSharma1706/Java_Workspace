package Oops.Argument_Passing.PassingReferenceses;

public class Data {
    private int i,j;
    public void setData(int x,int y){
        i=x;
        j=y;
    }
    public void increment(Data p){
        p.i=p.i+5;
        p.j=p.j+5;
        System.out.println("After update in values: i="+i+", j="+j);
    }
    public void show(){
        System.out.println("i="+i+", j="+j);
    }
}
