import java.util.Scanner;
class sample
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int sum=0,c=0,pal=0,max=0,ind=0;
        for(int i=0;i<n;i++)
        {
            sum=0;c=0;
            for(int j=i;j<n;j++)
            {
                c++;
                sum+=a[j];
                int t=sum;
                pal=0;
                while(t>0)
                {
                    int r=t%10;
                    t/=10;
                    pal=(pal*10)+r;
                }
                if(pal==sum && c>1)
                {
                    if(max<c)
                    {
                        max=c;
                        ind=i;
                    }
                }
            }
        }
        if(ind==0)
        {
            for(int i=ind;i<max;i++)
            {
                System.out.print(a[i]+" ");
            }
        }
        else
        {
            for(int i=ind;i<=max;i++)
            {
                System.out.print(a[i]+" ");
            }
        }
    }
}