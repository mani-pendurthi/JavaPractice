package TwoDimensionalArrays;

import java.util.Scanner;

public class array11
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r= sc.nextInt();
        int c= sc.nextInt();
        int arr[][]=new int[r][c];
        int col=0,row=0,col1=0,row1=0;

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            col=0;row=0;
            for(int j=0;j<c;j++)
            {
                if(arr[i][j]==arr[i][0])
                {
                    col++;
                }
                if(arr[j][i]==arr[0][i])
                {
                    row++;
                }
            }
            if(col==c)
            {
                col1++;
            }
            if(row==r)
            {
                row1++;
            }

        }
        if(col1==r)
        {
            System.out.println("Equal row matrix");
        }
        else if (row1 ==c)
        {
            System.out.println("Equal column matrix");
        }
    }
}
