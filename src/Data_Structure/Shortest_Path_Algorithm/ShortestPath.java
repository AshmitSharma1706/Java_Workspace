package Data_Structure.Shortest_Path_Algorithm;

import java.util.Scanner;

public class ShortestPath {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int row;
        System.out.println("Enter the number vertices in your graph.");
        row=kb.nextInt();
        int [][] wMat=new int[row][row];
        for (int i=0; i<row; i++){
            for (int j=0; j<row; j++){
                System.out.println("Is there a direct path from vertex v["+(i+1)+"] to v["+(j+1)+"]... if yes--> enter weight : no-->enter 0.");
                wMat[i][j]= kb.nextInt();
            }
        }
        int[][] sp=new int[row][row];
        warshall(wMat,sp);
        System.out.println("Shortest path Matrix is...");
        for(int []arr:sp){
            for (int x:arr){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
    public static void warshall(int[][] wMat, int[][] sp){
        int infinity=100000;
        for(int i=0; i<wMat.length; i++){
            for(int j=0; j<wMat[i].length; j++){
                if(wMat[i][j]!=0){
                    sp[i][j]=wMat[i][j];
                }
                else{
                    sp[i][j]=infinity;
                }
            }
        }
        for(int k=0; k<sp.length; k++){
            for(int i=0; i<sp.length; i++){
                for(int j=0; j<sp[i].length; j++){
                    if(sp[i][j]>sp[i][k]+sp[k][j]){
                        sp[i][j]=sp[i][k]+sp[k][j];
                    }
                }
            }
        }
    }
}
