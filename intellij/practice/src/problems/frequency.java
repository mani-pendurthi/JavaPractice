import java.util.*;
class A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int f[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
                c=0;
                for(int j=0;j<n;j++)
                {
                    if(a[i]==a[j])
                    {
                        c++;
                    }
                }
                f[i]=c;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(f[j]<f[j+1])
                {
                    int t=f[j];
                    f[j]=f[j+1];
                    f[j+1]=t;
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
                c=0;
                for(int j=0;j<i;j++)
                {
                    if(a[i]==a[j])
                    {
                        c++;
                    }
                }
                if(c==0)
                {
                    System.out.print(a[i]+"-->"+f[i]+"  ");
                }
        }
        /*for(int i=0;i<n;i++)
        {
            c=0;
            for(int j=0;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    c++;
                }
            }
            if(max<c)
            {
                max=c;
            }
        }

        for(int k=c;k>=1;k--)
        {
            for(int i=0;i<n;i++)
            {
                c=0;
                for(int j=0;j<i;j++)
                {
                    if(a[i]==a[j])
                    {
                        c++;
                    }
                }
                if(c==0)
                {
                    c=0;
                    int j;
                    for(j=0;j<n;j++)
                    {
                        if(a[i]==a[j])
                        {
                            c++;
                        }
                    }
                    if(c==k)
                    {
                        System.out.print(a[i]+"->"+c+" ");
                    }
                }
            }
        }*/
    }
}
