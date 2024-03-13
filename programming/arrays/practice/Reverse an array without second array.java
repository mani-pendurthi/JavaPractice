import java.util.Scanner;
import java.util.Arrays;
class main
{
    static int [] m1(int a[],int n)
    {
        int ind=n-1;
        for(int i=0;i<n/2;i++)
        {
            int e=a[ind];
            int s=a[i];
            a[i]=e;
            a[ind]=s;
            ind--;
        }
        return a;
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        m1(a,n);
        System.out.print(Arrays.toString(a));
    }
}