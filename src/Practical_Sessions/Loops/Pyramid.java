package Practical_Sessions.Loops;

public class Pyramid {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
//        for (int i = 1; i <= 4; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 4; j <= 8-i; j++) {
//                System.out.print("* ");
//            }
//            for (int j = 4; j > i; j--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
    }
}
