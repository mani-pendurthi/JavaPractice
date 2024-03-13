import java.util.Scanner;
class Main
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        
        int a[]=new int[m];
        int b[]=new int[n];
        int sum=0,c=0;
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<b.length;i++)
        {
            b[i]=sc.nextInt();
        }
        
            if(m<n)
            {
                for(int i=0;i<m;i++)
                {
                    sum=a[i]+b[i];
                    System.out.print(sum+" ");
                    c++;
                }
                if(c==m)
                {
                    for(int i=c;i<n;i++)
                    {
                        System.out.print(b[i]+" ");
                    }
                }
            }
            else
            {
                for(int i=0;i<n;i++)
                {
                    sum=a[i]+b[i];
                    System.out.print(sum+" ");
                    c++;
                }
                if(c==n)
                {
                    for(int i=c;i<m;i++)
                    {
                        System.out.print(a[i]+" ");
                    }
                }
            }
        
    }
}