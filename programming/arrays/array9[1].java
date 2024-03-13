import java.util.Scanner;
class Main
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i+=2)
        {
            int x=a[i];
            a[i]=a[i+1];
            a[i+1]=x;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}