import java.util.Scanner;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int co[]=new int [n];
        int e[]=new int [n];
        int ac=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--)
        {
            int c=0;
            for(int j=n-1;j>i;j--)
            {
                if(a[i]==a[j])
                {
                    c++;
                }
            }
            if(c==0)
            {
                for(int k=i;k>=0;k--)
                {
                    if(a[i]==a[k])
                    {
                        c++;
                    }
                }
                e[ac]=a[i];
                co[ac]=c;
                ac++;
            }
        }
        for(int i=ac-1;i>=0;i--)
        {
            if(e[i]<10)
            {
                System.out.println(e[i]+"----"+co[i]);
            }
            else
            {
                System.out.println(e[i]+"---"+co[i]);
            }
        }
    }
}