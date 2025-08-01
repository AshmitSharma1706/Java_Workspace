package Practice;

import java.util.Scanner;

public class TcsXploreIPA1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=s.nextLine();
        int count=0;
        String []arr=str.split(" ");
        for (String x:arr){
            char c=x.charAt(0);
            if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U' ||c=='a' ||c=='e' ||c=='i' ||c=='o' || c=='u'){
                count++;
            }
        }
        if (count>0){
            System.out.println(count);
        }
        else {
            System.out.println("No String found");
        }
    }
}
