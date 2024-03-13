import java.util.Scanner;
class subsequence
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        int k=(int)Math.pow(2,n);
        for(int i=1;i<k;i++)
        {
            int t=i,ind=0;
            while (t>0)
            {
                int r=t%2;
                t/=2;
                if(r==1)
                {
                    System.out.print(a[ind]);
                    ind++;
                }
            }
            System.out.println();
        }
    }
}
