package Practice;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the length of the rectangle in meters:");
        int length=kb.nextInt();
        System.out.println("Enter the breadth of the rectangle in meters:");
        int breadth=kb.nextInt();
        int area=length*breadth;
        int perimeter=2*(length+breadth);
        System.out.println("The area and perimeter of the rectangle is: "+area+" meter square, "+perimeter+" meter");
    }

}
