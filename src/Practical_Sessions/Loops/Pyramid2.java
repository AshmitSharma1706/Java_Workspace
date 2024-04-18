package Practical_Sessions.Loops;

public class Pyramid2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(j+" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j=2; j<=6-i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
