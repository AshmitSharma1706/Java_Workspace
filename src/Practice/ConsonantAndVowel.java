package Practice;

import java.util.Scanner;

public class ConsonantAndVowel {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter any Alphabet.");
        char alp=kb.next().charAt(0);
        if(alp=='a' || alp=='e' || alp=='i' || alp=='o' || alp=='u' ||
                alp=='A' || alp=='E' || alp=='I' || alp=='O' || alp=='U'){
            System.out.println(alp+" is a Vowel.");
        }
        else {
            System.out.println(alp+" is a Consonant");
        }
    }
}
