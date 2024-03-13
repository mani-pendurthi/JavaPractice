import java.util.Scanner;
class Main
{
    public static void main(String[]args)
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
            for(int j=i;j<n;j++)
            {
                if(f[i]<f[j])
                {
                    int t=f[i];
                    f[i]=f[j];
                    f[j]=t;
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
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
                if(a[i]<10)
                {
                    System.out.println(a[i]+"---->"+f[i]);
                }
                else
                {
                    System.out.println(a[i]+"--->"+f[i]);
                }
            }
        }
    }
    
}