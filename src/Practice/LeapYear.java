package Practice;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter any year:");
        int year= kb.nextInt();
        if((year%400==0) || ((year%4==0) && (year%100!=0))){
            System.out.println(year+" is a Leap Year.");
        }
        else{
            System.out.println(year+" is not a Leap Year.");
        }
    }
}
