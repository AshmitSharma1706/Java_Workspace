package Oops.Argument_Passing.PassingVariables;

public class UseIncrement {
    public static void main(String[] args) {
        int i=10,j=20;
        System.out.println("Before incrementing: i="+i+", j="+j);
        Increment I=new Increment();
        I.increment(i,j);
        System.out.println("After incrementing: i="+i+", j="+j);
    }
}
