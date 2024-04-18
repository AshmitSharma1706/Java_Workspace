package Practice;

import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter any from 1 to 7:");
        int n= kb.nextInt();
        if(n==1){
            System.out.println("It's Monday.");
        } else if (n==2) {
            System.out.println("It's Tuesday.");
        } else if (n==3) {
            System.out.println("It's Wednesday.");
        } else if (n==4) {
            System.out.println("It's Thursday.");
        } else if (n==5) {
            System.out.println("It's Friday.");
        } else if (n==6) {
            System.out.println("It's Saturday.");
        } else if (n==7) {
            System.out.println("It's Sunday.");
        }
        else {
            System.out.println("Number out of range!!!");
            System.out.println("Please enter valid number(1 to 7).");
        }
    }
}
