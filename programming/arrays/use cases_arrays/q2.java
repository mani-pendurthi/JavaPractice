import java.util.*;
class Main
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int po=1;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int p=(int)Math.pow(a[i],po);
            po++;
            System.out.print(p+" ");
        }
    }
}