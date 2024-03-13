package TwoDimensionalArrays;

import java.util.Scanner;

public class array10
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int c= sc.nextInt();
        int arr[][]=new int[n][c];
        int c1=0,t=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }
        t=arr[0][0];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i==j && arr[i][j]==t)
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
            System.out.println(t+"-Identity matrix");
        }
        else
        {
            System.out.println("Not an identity matrix");
        }
    }
}
