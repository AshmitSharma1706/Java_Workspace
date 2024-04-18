package Oops.Encapsulation;

import java.util.Scanner;

public class UseCircle {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the radius of Circle:");
        int r= kb.nextInt();

        Circle c=new Circle();
        c.setRadius(r);
        c.calculateCircumference();
        c.calculateArea();
    }
}
