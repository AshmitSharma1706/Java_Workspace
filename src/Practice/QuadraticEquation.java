package Practice;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the 3 values of an quadratic equation as 'ax^2+bx+c=0':");
        System.out.println("First value(a):");
        int a= kb.nextInt();
        System.out.println("Second value(b):");
        int b=kb.nextInt();
        System.out.println("Third value(c):");
        int c= kb.nextByte();
        double d=Math.sqrt((b*b)-(4*a*c));
        double x1=(-b+d)/2*a;
        double x2=(-b-d)/2*a;
        System.out.println("The roots of equation ("+a+"x^2+"+b+"x+"+c+"=0), are: "+x1+", "+x2);
    }
}
