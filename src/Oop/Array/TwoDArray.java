package Oop.Array;

import java.util.Scanner;

public class TwoDArray
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int row,col;
        System.out.println("Enter the row and col size:");
        row=kb.nextInt();
        col=kb.nextInt();
        int [][] arr = new int [row][col];
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                System.out.println("Enter value for["+i+"["+j+"]");
                arr[i][j]=kb.nextInt();

            }
        }
        int sum=0;
        System.out.println("The values you entered are:");
        for(int i=0; i<row; i++)
        {
            for (int j=0; j<col; j++) {
                System.out.print(arr[i][j] + "  ");
                sum += arr[i][j];
            }
            System.out.println("  ");
        }
        System.out.println("Sum is: "+sum);
        System.out.println("Average is: "+sum/(row*col));
    }
}
