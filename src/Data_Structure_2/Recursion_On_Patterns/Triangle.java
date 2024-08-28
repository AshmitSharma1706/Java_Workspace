package Data_Structure_2.Recursion_On_Patterns;

public class Triangle {
    public static void main(String[] args) {
        draw2(4,0);
    }
    public static void draw(int row, int col){
        if(row==0){
            return;
        }
        if(col<row){
            System.out.print("* ");
            draw(row,col+1);
        }
        else {
            System.out.println();
            draw(row-1,0);
        }
    }
    public static void draw2(int row, int col){
        if(row==0){
            return;
        }
        if(col<row){
            draw2(row,col+1);
            System.out.print("* ");
        }
        else {
            draw2(row-1,0);
            System.out.println();
        }
    }
}
