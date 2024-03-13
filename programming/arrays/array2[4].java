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
        int min=a[0];
        for(int i=0;i<n;i++)
        {
            if(min>a[i])
            {
                min=a[i];
            }
        }
        for(int i=min;i>=1;i--)
        {
            int j=0;
            for(j=0;j<n;j++)
            {
                if(a[j]%i!=0)
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