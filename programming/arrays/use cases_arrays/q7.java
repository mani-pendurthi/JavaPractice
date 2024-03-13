import java.util.*;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int a[]=new int[n];
        int ind=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int b[]=new int[m];
        for(int i=0;i<n;i++)
        {
            b[i]=sc.nextInt();
        }
        int c[]=new int[m+n];
        for(int i=0;i<m+n;i++)
        {
            if(i<n)
            {
                c[i]=a[i];
            }
            else
            {
                c[i]=b[ind++];
            }
        }
        System.out.print(Arrays.toString(c));
    }
}