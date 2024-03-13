package TwoDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class array12
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                for(int k=0;k<n-1-j;k++)
                {
                    if(arr[i][k]>arr[i][k+1])
                    {
                        int t=arr[i][k];
                        arr[i][k]=arr[i][k+1];
                        arr[i][k+1]=t;
                    }
                }
            }
        }
        for(int k[]:arr)
        {
            System.out.println(Arrays.toString(k));
        }

    }
}
