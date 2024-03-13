package TwoDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class array13
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int r= sc.nextInt();
        int c= sc.nextInt();
        int matrix1[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                matrix1[i][j]=sc.nextInt();
            }
        }
        int r1= sc.nextInt();
        int c1= sc.nextInt();
        int matrix2[][]=new int[r1][c1];
        int mul=0,sum=0;
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                matrix2[i][j]=sc.nextInt();
            }
        }
        int matrix3[][]=new int[r][c1];
        for(int i=0;i<r;i++)
        {
            for(int k=0;k<c1;k++)
            {
                sum=0;
                for(int j=0;j<r1;j++)
                {
                    sum+=matrix1[i][j]*matrix2[j][k];
                }
                matrix3[i][k]=sum;
            }
        }
        for(int arr[]:matrix3)
        {
            System.out.println(Arrays.toString(arr));
        }
    }
}
