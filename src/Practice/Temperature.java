package Practice;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenheit:");
        int temp=kb.nextInt();
        double cal=(temp-32)*((double) 5 /9);
        System.out.println("The temperature in degree celsius is: "+cal);
    }
}
