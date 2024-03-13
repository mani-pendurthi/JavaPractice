import java.util.*;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int f[]=new int[n];
        int c=0,t=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(a[j]+" ");
            }
            for(int j=0;j<i;j++)
            {
                System.out.print(a[j]+" ");
            }
            System.out.println();
        }
    }
}