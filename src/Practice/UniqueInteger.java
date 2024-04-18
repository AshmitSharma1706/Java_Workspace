package Practice;

import java.util.Scanner;

public class UniqueInteger {
    public static void main(String[] args) {
        int ll=0, ul=0, mod;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter lower limit:");
        ll=s.nextInt();

        System.out.println("Enter upper limit:");
        ul=s.nextInt();
        for(int i=ll; i<=ul; i++){
            mod=i%10;
        }
        System.out.println();
    }
}
