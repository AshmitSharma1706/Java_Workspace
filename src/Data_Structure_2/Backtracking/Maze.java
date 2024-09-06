package Data_Structure_2.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Maze {
    public static void main(String[] args) {
        System.out.println(paths(3,3));
        boolean[][] maze={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] path=new int [maze.length][maze[0].length];
        allPaths2("",maze,0,0,path,1);
    }
    public static int paths(int row, int col){
        if(row==1 || col==1){
            return 1;
        }
        int left=paths(row-1,col);
        int right=paths(row,col-1);
        return left+right;
    }
    public static void paths2(String s, int row, int col){
        if(row==1 && col==1){
            System.out.println(s);
            return;
        }
        if(row>1){
            paths2(s+'D',row-1,col);
        }
        if(col>1){
            paths2(s+'R',row,col-1);
        }
    }
    public static List<String> pathsList(String s, int row, int col){
        if(row==1 && col==1){
            List<String> list=new ArrayList<>();
            list.add(s);
            return list;
        }
        List<String> answer=new ArrayList<>();
        if(row>1){
            answer.addAll(pathsList(s+'D',row-1,col));
        }
        if(col>1){
            answer.addAll(pathsList(s+'R',row,col-1));
        }
        return answer;
    }
    public static List<String> pathsDiagonalList(String s, int row, int col){
        if(row==1 && col==1){
            List<String> list=new ArrayList<>();
            list.add(s);
            return list;
        }
        List<String> answer=new ArrayList<>();
        if(row>1){
            answer.addAll(pathsDiagonalList(s+'V',row-1,col));
        }
        if(col>1){
            answer.addAll(pathsDiagonalList(s+'H',row,col-1));
        }
        if(row>1 && col>1){
            answer.addAll(pathsDiagonalList(s+'D',row-1,col-1));
        }
        return answer;
    }
    public static void pathsRestriction(String s,boolean[][] maze, int row, int col){
        if(row== maze.length-1 && col==maze[0].length-1){
            System.out.println(s);
            return;
        }
        if(!maze[row][col]){
            return;
        }
        if(row<maze.length-1){
            pathsRestriction(s+'D',maze,row+1,col);
        }
        if(col<maze[0].length-1){
            pathsRestriction(s+'R',maze,row,col+1);
        }
    }
    public static void allPaths(String s,boolean[][] maze, int row, int col){
        if(row== maze.length-1 && col==maze[0].length-1){
            System.out.println(s);
            return;
        }
        if(!maze[row][col]){
            return;
        }
        maze[row][col]=false;
        if(col>0){
            allPaths(s+'L',maze,row,col-1);
        }
        if(row>0){
            allPaths(s+'U',maze,row-1,col);
        }
        if(row<maze.length-1){
            allPaths(s+'D',maze,row+1,col);
        }
        if(col<maze[0].length-1){
            allPaths(s+'R',maze,row,col+1);
        }
        maze[row][col]=true;
    }
    public static void allPaths2(String s,boolean[][] maze, int row, int col,int [][] path,int step){
        if(row== maze.length-1 && col==maze[0].length-1){
            path[row][col]=step;
            for(int [] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(s);
            System.out.println();
            return;
        }
        if(!maze[row][col]){
            return;
        }
        maze[row][col]=false;
        path[row][col]=step;
        if(col>0){
            allPaths2(s+'L',maze,row,col-1,path,step+1);
        }
        if(row>0){
            allPaths2(s+'U',maze,row-1,col,path,step+1);
        }
        if(row<maze.length-1){
            allPaths2(s+'D',maze,row+1,col,path,step+1);
        }
        if(col<maze[0].length-1){
            allPaths2(s+'R',maze,row,col+1,path,step+1);
        }
        maze[row][col]=true;
        path[row][col]=0;
    }
}
