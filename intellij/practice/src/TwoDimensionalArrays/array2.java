package TwoDimensionalArrays;

import java.util.Scanner;

public class array2
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
        int k= sc.nextInt();
        int count=0;
        b:
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(arr[i][j]==k)
                {
                    count=1;
                    break b;
                }
            }
        }
        if(count==1)
        {
            System.out.println("Found");
        }
        else
        {
            System.out.print("Not Found");
        }
    }
}
