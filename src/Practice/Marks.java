package Practice;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name= kb.nextLine();
        System.out.println("Hii, "+name);
        System.out.println("Enter your english marks:");
        int english=kb.nextInt();
        System.out.println("Enter your maths marks:");
        int maths=kb.nextInt();
        System.out.println("Enter your computer marks:");
        int computer=kb.nextInt();
        int total=english+maths+computer;
        int percentage=total/3;
        System.out.println("The total marks are: "+total);
        System.out.println("The percentage is: "+percentage+"%");
    }
}
