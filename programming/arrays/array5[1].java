import java.util.Scanner;
class Main
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int fc=0,sum=0;
        float c=0;
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            fc=0;
            for(int j=2;j<a[i];j++)
            {
                if(a[i]%j==0)
                {
                    fc++;
                }
            }
            if(fc==0 && a[i]!=1)
            {
                sum+=a[i];
                c++;
            }
        }
        System.out.print(sum/c);
    }
}