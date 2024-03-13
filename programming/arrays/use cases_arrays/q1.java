import java.util.*;
class Main
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int ind=n;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int s=0;
            while(a[i]>0)
            {
                int r=a[i]%10;
                a[i]/=10;
                s=(s*10)+r;
            }
            a[i]=s;
        }
        for(int i=0;i<n;i++)
        {
            b[i]=a[--ind];
        }
        System.out.print(Arrays.toString(b));
    }
}