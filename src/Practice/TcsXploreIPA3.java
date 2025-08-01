package Practice;

import java.util.Scanner;

public class TcsXploreIPA3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a word:");
        String str=s.nextLine();
        int count=0;
        for (char c:str.toCharArray()){
            if(c>=97 && c<=122){
                count++;
            }
        }
        if(count>0){
            System.out.println(count);
        }
        else {
            System.out.println("No lower case characters present");
        }
    }
}
