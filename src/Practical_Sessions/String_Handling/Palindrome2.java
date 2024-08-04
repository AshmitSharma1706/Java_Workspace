package Practical_Sessions.String_Handling;

import java.util.Locale;
import java.util.Scanner;

public class Palindrome2 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter a string:");
        String str= kb.nextLine();
        str=str.toLowerCase();
        for(int k=0; k<str.length(); k++){
            char ch=str.charAt(k);
            if(Character.isLetterOrDigit(ch)){

            }
        }
        int i=0;
        int j=str.length()-1;
        boolean isPalindrome=true;

        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                isPalindrome=false;
                break;
            }
            i++;
            j--;
        }
        if(isPalindrome){
            System.out.println(str+" is Palindrome");
        }
        else{
            System.out.println(str+" is no Palindrome");
        }
    }
}
