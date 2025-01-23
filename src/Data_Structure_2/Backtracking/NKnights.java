package Data_Structure_2.Backtracking;

public class NKnights {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board= new boolean[n][n];
        placeKnights(board,0,0,4 );
    }
    public static void placeKnights(boolean[][] board, int row, int col, int knights){
        if(knights==0){
            display(board);
            System.out.println();
            return;
        }

        if(row== board.length-1 && col==board.length){
            return;
        }

        if(col== board.length){
            placeKnights(board,row+1,0,knights);
            return;
        }

        if(isSafe(board,row,col)){
            board[row][col]=true;
            placeKnights(board,row,col+1,knights-1);
            board[row][col]=false;
        }

        placeKnights(board,row,col+1,knights);
    }

//    public static int placeKnightsCounts(boolean[][] board, int row, int col, int knights){
//        if(knights==0){
//            display(board);
//            System.out.println();
//            return 1;
//        }
//
//        int count=0;
//
//        if(row== board.length-1 && col==board.length){
//            return 0;
//        }
//
//        if(col== board.length){
//            placeKnightsCounts(board,row+1,0,knights);
//            return 1;
//        }
//
//        if(isSafe(board,row,col)){
//            board[row][col]=true;
//            count+=placeKnightsCounts(board,row,col+1,knights-1);
//            board[row][col]=false;
//        }
//
//        count+=placeKnightsCounts(board,row,col+1,knights);
//
//        return count;
//    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        if(isValid(board,row-2,col-1)){
            if (board[row-2][col-1]){
                return false;
            }
        }

        if(isValid(board,row-1,col-2)){
            if (board[row-1][col-2]){
                return false;
            }
        }

        if(isValid(board,row-2,col+1)){
            if (board[row-2][col+1]){
                return false;
            }
        }

        if(isValid(board,row-1,col+2)){
            if (board[row-1][col+2]){
                return false;
            }
        }

        return true;
    }

    private static boolean isValid(boolean[][] board, int row, int col) {
        return row >= 0 && row < board.length && col >= 0 && col < board.length;
    }

    private static void display(boolean[][] board) {
        for(boolean [] row:board){
            for(boolean element: row){
                if(element){
                    System.out.print("K ");
                }
                else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }
}
