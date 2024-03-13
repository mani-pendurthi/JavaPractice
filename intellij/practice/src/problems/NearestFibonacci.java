package problems;

import java.util.Scanner;

public class NearestFibonacci
{
    static void fibonacci(int n) {
        int a=0,b=1,c=0;
        int before=0;
        int after=0;
        for(int i=0;i<=(n*2);i++)
        {
            if(a<n)
            {
                before=a;
            }
            else if(a>n){
                after=a;
                break;
            }
            c=a+b;
            a=b;
            b=c;
        }
        if(after==n)
        {
            System.out.println(before);
        }
        else
        {
            int bef=n-before;
            int aft=after-n;
            if(bef<aft)
            {
                System.out.println(before);
            }
            else if(aft<bef)
            {
                System.out.println(after);
            }
            else
            {
                System.out.print(before+" ");
                System.out.println(after);
            }
       }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0 || arr[i]==1)
            {
                if(arr[i]==0)
                {
                    System.out.println("1");
                }
                else {
                    System.out.println("0 1");
                }
            }
            else
            {
                fibonacci(arr[i]);
            }
        }
    }
}
