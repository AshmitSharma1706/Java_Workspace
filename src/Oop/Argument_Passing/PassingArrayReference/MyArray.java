package Oop.Argument_Passing.PassingArrayReference;

public class MyArray {
    public int calculate(int[] brr){
        int sum=0;
        for(int i=0; i<brr.length; i++){
            sum=sum+brr[i];
        }
        return sum;
    }
}
