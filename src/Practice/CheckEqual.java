package Practice;

import java.util.Scanner;

public class CheckEqual {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter any 3 numbers.");
        System.out.println("First number:");
        int a=kb.nextInt();
        System.out.println("Second number:");
        int b= kb.nextInt();
        System.out.println("Third number:");
        int c= kb.nextInt();
        if(a==b && b==c){
            System.out.println("All the 3 numbers are equal, that is: "+a);
        }
        else if (a==b) {
            System.out.println("First and Second both number are same, that is: "+a+" and Third number is: "+c);
        }
        else if (b==c) {
            System.out.println("Second and Third both number are same, that is: "+b+" and First number is: "+a);
        }
        else {
            System.out.println("All the 3 numbers are different, that is: "+a+","+b+","+c);
        }
    }
}
