import java.util.Scanner;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        int b=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(b>a[i])
            {
                b=a[i];
            }
        }
        System.out.print(b);
    }
}