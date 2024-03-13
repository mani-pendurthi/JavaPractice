//Alternative Even numbers

import java.util.Scanner;
class Main
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int c=0;
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                c++;
                if(c%2==1)
                {
                    System.out.print(a[i]+" ");
                }
            }
        }
    }   
}