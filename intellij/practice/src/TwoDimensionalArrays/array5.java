package TwoDimensionalArrays;

import java.util.Scanner;

public class array5
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int c= sc.nextInt();
        int a[][]=new int[n][c];
        int sum=0,c1=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]= sc.nextInt();
            }
        }
        for(int i[]:a)
        {
            for (int x:i)
            {
                if(x%2==1)
                {
                    sum+=x;
                    c1++;
                }
            }
        }
        System.out.print(sum/c1);
    }
}
