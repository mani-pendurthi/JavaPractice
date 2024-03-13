package problems;

import java.util.Arrays;
import java.util.Scanner;

public class MissingElementsOfArray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        if(n==1)
        {
            System.out.print(1);
        }
        else
        {
            int arr[]=new int[n-1];
            boolean b=true;
            for(int i=0;i<arr.length;i++)
            {
                arr[i]= sc.nextInt();
            }
            Arrays.sort(arr);
            for(int i=0;i<arr.length-1;i++)
            {
                for(int j=arr[i];j<arr[i+1];j++)
                {
                    if(j!=arr[i])
                    {
                        System.out.print(j+" ");
                        b=false;
                    }
                }
            }
            if(b)
            {
                System.out.println(arr[0]+1);
            }
        }
    }
}
