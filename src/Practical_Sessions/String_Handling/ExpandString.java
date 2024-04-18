package Practical_Sessions.String_Handling;

import java.util.Scanner;

public class ExpandString {
    public static String expandString(String str) {
        StringBuffer sb1= new StringBuffer();

        int j;
        for (int i=0; i<str.length(); i++){
            int count=str.charAt(i)-'0';
            StringBuffer sb2= new StringBuffer();
            for (j=i+2; str.charAt(j)!=')'; j++){
                sb2.append(str.charAt(j));
            }
            for (int k=0; k<count;k++){
                sb1.append(sb2);
            }
            i=j;
        }
        return sb1.toString();
    }

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the String to expand:");
        String s=kb.nextLine();
        String result=expandString(s);
        System.out.println(result);
    }
}
