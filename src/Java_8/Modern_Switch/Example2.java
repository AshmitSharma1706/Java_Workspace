package Java_8.Modern_Switch;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int day=s.nextInt();
        switch (day){
            case 1,2 -> {
                System.out.println("Week started");
            }
            case 3,4,5 -> {
                System.out.println("Mid of week");
            }
            case 6,7 -> {
                System.out.println("Weekend");
            }

            default -> System.out.println("Invalid day..!");
        }
    }
}
