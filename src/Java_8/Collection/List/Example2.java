package Java_8.Collection.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        List<Integer> numList=new ArrayList<>(10);
        List<Integer> duplicates=new ArrayList<>(10);
        List<Integer> uniques=new ArrayList<>(10);

        Scanner s=new Scanner(System.in);
        System.out.println("Enter 10 numbers:");

        for (int i=1; i<=10; i++) {
            System.out.println("Enter "+i+" number:");
            int x=s.nextInt();
            numList.add(x);
            if(!uniques.contains(x) && !duplicates.contains(x)){
                uniques.add(x);
            }
            else if(uniques.contains(x)){
                uniques.remove(x);
                duplicates.add(x);
            }
        }
        System.out.println("All numbers entered: " + numList);
        System.out.println("Unique numbers (" + uniques.size() + "): " + uniques);
        System.out.println("Duplicate numbers (" + duplicates.size() + "): " + duplicates);
    }
}
