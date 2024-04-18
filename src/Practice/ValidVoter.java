package Practice;

import java.util.Scanner;

public class ValidVoter {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name= kb.nextLine();
        System.out.println("Enter your age:");
        int age=kb.nextInt();
        if(age>=18){
            System.out.println("Hello "+name+", You are a valid voter.");
        }
        else {
            System.out.println("Sorry "+name+", You are not valid voter.");
            System.out.println("You can vote when you are 18 years or more than 18 years.");
        }
    }
}
