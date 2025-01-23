package Oop.Encapsulation;

import java.util.Scanner;

public class UseStudent1 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter your Details.");
        System.out.println("Roll number:");
        int r= kb.nextInt();
        System.out.println("Name:");
        kb.nextLine();
        String n= kb.nextLine();
        System.out.println("Percent:");
        double p= kb.nextDouble();
        Student1 s=new Student1();
        s.setStudent(r,n,p);
        s.showStudent();
    }
}
