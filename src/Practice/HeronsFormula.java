package Practice;

import java.util.Scanner;

public class HeronsFormula {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the value of 3 side of the triangle:");
        System.out.println("First side:");
        int a= kb.nextInt();
        System.out.println("Second side:");
        int b=kb.nextInt();
        System.out.println("Third side:");
        int c= kb.nextByte();
        double S= (double) (a + b + c) /2;
        int x= (int) (S-a);
        int y= (int) (S-b);
        int z= (int) (S-b);
        double area=Math.sqrt(S*x*y*z);
        System.out.println("The area of triangle is :"+area+" meter square");
    }
}
