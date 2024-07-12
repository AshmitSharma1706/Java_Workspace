package Data_Structure.Graph.Adjacency_Matrix;

import javax.security.sasl.SaslClientFactory;
import java.util.Scanner;

public class AdjacencyMatrix {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int row;
        System.out.println("Enter the number vertices in your graph.");
        row=kb.nextInt();
        int [][] adjMat=new int[row][row];
        for (int i=0; i<row; i++){
            for (int j=0; j<row; j++){
                System.out.println("Is there a direct path from vertex v["+(i+1)+"] to v["+(j+1)+"]... if yes--> enter 1 : no-->enter 0.");
                adjMat[i][j]= kb.nextInt();
            }
        }
        System.out.println("Adjacency Matrix is...");
        for(int []arr:adjMat){
            for (int x:arr){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
