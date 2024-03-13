package TwoDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class array3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int r= sc.nextInt();
        int c= sc.nextInt();
        int arr[][]=new int[r][c];

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int max1=0,max2=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(max1<arr[i][j])
                {
                    max1=arr[i][j];
                }
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(max2<arr[i][j] && arr[i][j]!=max1)
                {
                    max2=arr[i][j];
                }
            }
        }
        System.out.print(max2);
    }
}
