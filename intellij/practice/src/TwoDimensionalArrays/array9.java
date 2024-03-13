package TwoDimensionalArrays;

import java.util.Scanner;

public class array9
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int c= sc.nextInt();
        int arr[][]=new int[n][c];
        int c1=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i==j && arr[i][j]==1)
                {
                    c1++;
                }
                else if(arr[i][j]==0)
                {
                    c1++;
                }
            }
        }
        if(c1==(n*c))
        {
            System.out.println("Identical matrix");
        }
        else
        {
            System.out.println("Not an identical matrix");
        }
    }
}
