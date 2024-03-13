import java.util.Scanner;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int c=0,dp=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            c=0;
            for(int j=i;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    c++;
                }
            }
            if(c==2)
            {
                dp++;
            }
        }
        System.out.print(dp);
    }
}