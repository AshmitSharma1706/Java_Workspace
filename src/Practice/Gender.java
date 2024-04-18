package Practice;

import java.util.Objects;
import java.util.Scanner;

public class Gender {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Please tell your gender as 'male' or 'female':");
        String a=kb.nextLine();
        if(Objects.equals(a, "male")){
            System.out.println("Good Morning sir, We welcome you here");
        }
        else {
            System.out.println("Good Morning mam, We welcome you here");
        }
    }
}
