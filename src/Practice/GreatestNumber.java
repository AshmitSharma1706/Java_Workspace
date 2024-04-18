package Practice;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter any 2 numbers.");
        System.out.println("First number: ");
        int a= kb.nextInt();
        System.out.println("Second number: ");
        int b= kb.nextInt();
        if(a>b){
            System.out.println(a+" is Greater.");
        }
        else {
            System.out.println(b+" is Greater.");
        }
    }
}
