package TwoDimensionalArrays;

import java.util.Scanner;

public class array1
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();

        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }
        for(int a[]:arr)
        {
            for(int x:a)
            {
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
