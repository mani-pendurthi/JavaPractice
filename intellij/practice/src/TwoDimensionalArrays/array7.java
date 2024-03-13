package TwoDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class array7
{
    static int diagonal1(int arr[][],int n,int c)
    {
        int sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i==j)
                {
                    sum+=arr[i][j];
                }
            }
        }
        return sum;
    }
    static int diagonal2(int arr[][],int n,int c)
    {
        int sum=0,c1=0;
        for(int i=0;i<n;i++)
        {
            c1=0;
            for(int j=c-1-i;j>=0;j--)
            {
                sum+=arr[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int c= sc.nextInt();
        int arr[][]=new int[n][c];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println(diagonal1(arr,n,c));
        System.out.println(diagonal2(arr,n,c));
    }
}
