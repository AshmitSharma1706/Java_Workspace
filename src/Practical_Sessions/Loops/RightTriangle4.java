package Practical_Sessions.Loops;

public class RightTriangle4 {
    public static void main(String[] args) {
        int k=1;
        for (int i = 0; i <= 3; i++) {
            for (int j = 1; j <= i+1; j++) {
                System.out.print(k+"  ");
                k++;
            }
            System.out.println();

        }
    }
}
