import java.util.Scanner;
class Main
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int h=0,h2=0;
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        h=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(h<a[i])
            {
                h=a[i];
            }
        }
        h2=0;
        for(int i=0;i<a.length;i++)
        {
            if(h2<a[i] && a[i]!=h)
            {
                h2=a[i];
            }
        }
        System.out.print(h2);
    }
}