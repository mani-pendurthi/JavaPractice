package TwoDimensionalArrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class array6
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int c= sc.nextInt();
        int arr[][]=new int[n][c];
        int max=0;
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
                if(i==j)
                {
                    if(max<arr[i][j])
                    {
                        max=arr[i][j];
                    }
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i==j)
                {
                    arr[i][j]=max;
                }
            }
        }
        for(int i[]:arr)
        {
            for(int x:i)
            {
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
