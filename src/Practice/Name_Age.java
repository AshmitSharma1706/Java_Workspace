package Practice;

import java.util.Scanner;

public class Name_Age {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("What is your name:");
        String name=kb.nextLine();
        System.out.println("What is your age:");
        int age=kb.nextInt();
        System.out.println("Hello "+name+", You are "+age+" years old");
    }
}
