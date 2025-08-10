package Java_8.Collection.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> numList=new ArrayList<>();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 5 numbers:");
        for (int i=1; i<=5; i++) {
            System.out.println("Enter "+i+" number:");
            int x=s.nextInt();
            if(!numList.contains(x)){
                numList.add(x);
            }else {
                System.out.println("Number already exist..!");
                i=i-1;
            }
        }
        System.out.println(numList);
    }
}
