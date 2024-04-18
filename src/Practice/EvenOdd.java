package Practice;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter any number:");
        int n=kb.nextInt();
        if(n%2==0){
            System.out.println(n+" is an Even number.");
        }
        else {
            System.out.println(n+" is an Odd number.");
        }
    }
}
