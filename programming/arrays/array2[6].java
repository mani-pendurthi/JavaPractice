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
            System.out.println(Arrays.toString(a));
            t=a[0];
            for(int j=i;j<n;j++)
            {
                a[j-i]=a[j];
            }
            a[n-1]=t;
        }
    }
}