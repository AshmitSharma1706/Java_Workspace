package Java_8.Modern_Switch;

import java.util.Scanner;
import java.util.SortedMap;

public class Example3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter month number:");
        int month=s.nextInt();
        String season=switch (month){
            case 11,12,1,2 -> {
                System.out.println("Too cold...");
                yield "Winter";
            }
            case 3,4,5,6 -> {
                System.out.println("Too hot...");
                yield "Summer";
            }
            case 7,8,9,10 -> {
                System.out.println("Too perfect");
                yield "Rainy";
            }

            default -> "Invalid month..!";
        };
        System.out.println(season);
    }
}
