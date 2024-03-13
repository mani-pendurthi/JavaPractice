import java.util.Scanner;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int k=4;
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        int min=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(min>a[i])
            {
                min=a[i];
            }
        }
        for(int i=1;i<=k;)
        {
            min++;
            int c=0;
            for(int j=0;j<a.length;j++)
            {
                if(min==a[j])
                {
                    c++;
                }
            }
            if(c==0)
            {
                System.out.print(min+" ");
                i++;
            }
        }
    }
}