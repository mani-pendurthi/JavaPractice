import java.util.Scanner;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int max=a[0];
        for(int i=0;i<n;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
        }
        for(int i=max;;i+=max)
        {
            int j=0;
            for(j=0;j<n;j++)
            {
                if(i%a[j]!=0)
                {
                    break;
                }
            }
            if(j==n)
            {
                System.out.print(i);
                break;
            }
        }
    }
}