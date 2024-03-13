import java.util.*;
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
            for(int j=0;j<n-1-i;j++)
            {
                c=0;
                if(a[j]>a[j+1])
                {
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                    c++;
                }
                
            }
            if(c==0)
            {
                break;
            }
        }
        System.out.print(Arrays.toString(a));
    }
}