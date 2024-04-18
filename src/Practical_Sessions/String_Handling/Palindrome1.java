package Practical_Sessions.String_Handling;

import java.util.Scanner;

public class Palindrome1 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter a string:");
        String str= kb.nextLine();
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
