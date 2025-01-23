package Oop.Argument_Passing.ReturningArrayFromMethod;

public class ReturnArray {
    public double [] calculate(int [] brr){
        int sum=0;
        for (int x:brr){
            sum+=x;
        }
        double avg=(double) sum/ brr.length;
        double[]res=new double[2];
        res[0]=sum;
        res[1]=avg;
        return res;
    }
}
