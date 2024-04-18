package Practice;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int n;
        int sum=0;
        int count=0;
        Scanner s=new Scanner(System.in);
        do{
            System.out.println("Enter any integer:");
            n=s.nextInt();
            count++;
            sum+=n;
        }while (n>0);
        System.out.println("Sum is "+sum);
        System.out.println("count is "+count);
        System.out.println("avg is "+(sum/count));
    }
}
