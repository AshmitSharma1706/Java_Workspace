package Practice;

import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your percentage :");
        int percent=s.nextInt();
        if (percent>=35){
            System.out.println("Pass..!");
            if (percent < 65){
                System.out.println("Grade B");
            } else if (percent < 75) {
                System.out.println("Grade A");
            } else {
                System.out.println("Grade A+");
            }
        }
        else {
            System.out.println("Fail..!:");
        }
    }
}
