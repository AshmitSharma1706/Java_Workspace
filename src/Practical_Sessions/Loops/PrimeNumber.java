package Practical_Sessions.Loops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner kb=new Scanner(System.in);
        System.out.println("Enter any Number:");
        int n=kb.nextInt();
        boolean prime=true;
        for(int i=2; i<n; i++){
            if(n%i==0){
                prime=false;
            }
        }
        if(prime) {
            System.out.println("Number is prime");
        }
        else{
            System.out.println("Number is not prime");
        }
    }
}
