package Practical_Sessions.String_Handling;

import java.util.Scanner;

public class Pangram {
    public static boolean checkPangram(String str) {
        boolean[] arr =new boolean[26];
        str=str.toLowerCase();
        for (int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z'){
                int index=ch-'a';
                arr[index]=true;
            }
        }
        for (boolean x: arr) {
            if(!x){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter any String:");
        String s=kb.nextLine();
        boolean result=checkPangram(s);
        if(result){
            System.out.println("Your String is Pangram");
        }
        else {
            System.out.println("Your String is not Pangram");
        }
    }
}
