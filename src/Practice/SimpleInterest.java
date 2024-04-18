package Practice;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the principle amount:");
        int amt= kb.nextInt();
        System.out.println("Enter time in years:");
        double time=kb.nextDouble();
        System.out.println("Enter the rate of interest:");
        double rate=kb.nextDouble();
        double SI=(amt*time*rate)/100;
        System.out.println("The Simple Interest is: "+SI);
    }
}
