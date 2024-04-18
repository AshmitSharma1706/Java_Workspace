package Practical_Sessions.Loops;

public class StarPattern {
    public static void main(String[] args) {
        int k=1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(k+"  ");
                if(k<=9){
                    System.out.print(" ");
                }
                k++;
            }
            System.out.println();

        }
    }
}
