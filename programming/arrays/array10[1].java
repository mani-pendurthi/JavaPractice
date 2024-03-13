import java.util.Scanner;
class Main
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                sum=a[i]+a[j];
                if(sum==k)
                {
                    System.out.println(a[i]+" "+a[j]);
                }
            }
        }
    }
}