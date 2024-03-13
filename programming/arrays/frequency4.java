import java.util.Scanner;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    int t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        for(int i=0;i<n;i+=c)
        {
            c=0;
            for(int j=i;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    c++;
                }
            }
            if(a[i]<10)
            {
                System.out.println(a[i]+"--->"+c);
            }
            else
            {
                System.out.println(a[i]+"-->"+c);
            }
        }
    }
}