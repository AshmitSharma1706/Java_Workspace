package Practical_Sessions.Loops;

public class Pyramid1 {
    public static void main(String[] args) {
//        for (int i = 0; i <= 3; i++) {
//            for (int j = 1; j <= i+1; j++) {
//                System.out.print("*  ");
//            }
//            System.out.println();
//        }
//        for (int i = 2; i <= 4; i++) {
//            for (int j = 4; j >= i; j--) {
//                System.out.print("*  ");
//            }
//            System.out.println();
//        }
        square2(4);
    }
    public static void pyramid(int n){
        for (int i = 0; i < 2*n; i++) {
            int cols= i > n ? 2*n-i:i;
            for (int j = 0; j < cols; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
    public static void diamond(int n){
        for (int i = 0; i < 2*n; i++) {
            int cols= i > n ? 2*n-i:i;
            for (int space = 0; space < n - cols; space++) {
                System.out.print("  ");
            }
            for (int j = 0; j < cols; j++) {
                System.out.print("*   ");
            }
            System.out.println();
        }
    }
    public static void noTriangle(int n){
        for (int i = 1; i <= n; i++) {
            for (int space = 0; space < n - i; space++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j+" ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void noTriangle2(int n){
        for (int i = 1; i <= 2*n; i++) {
            int cols= i > n ? 2*n-i:i;
            for (int space = 0; space < n - cols; space++) {
                System.out.print("  ");
            }
            for (int j = cols; j >= 1; j--) {
                System.out.print(j+" ");
            }
            for (int j = 2; j <= cols; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void square(int n){
        n*=2;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int value=Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(value+" ");
            }
            System.out.println();
        }
    }
    public static void square2(int n){
        int originalN=n;
        n*=2;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int value=originalN-Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(value+" ");
            }
            System.out.println();
        }
    }
}
