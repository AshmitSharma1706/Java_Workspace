package Oops.Argument_Passing.PassingReferenceses;

public class UseData {
    public static void main(String[] args) {
        Data d1=new Data();
        d1.setData(10,20);
        System.out.println("Before incrementing.");
        d1.show();
        Data d2=new Data();
        d2.increment(d1);
        System.out.println("After incrementing.");
        d2.show();
    }
}
