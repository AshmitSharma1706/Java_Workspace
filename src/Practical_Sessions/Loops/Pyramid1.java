package Practical_Sessions.Loops;

public class Pyramid1 {
    public static void main(String[] args) {
        for (int i = 0; i <= 3; i++) {
            for (int j = 1; j <= i+1; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        for (int i = 2; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
