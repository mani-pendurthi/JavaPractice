import java.util.*;
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
        quick(a,0,n-1);
        System.out.print(Arrays.toString(a));
    }
    static void quick(int a[],int s,int e)
    {
        if(s<e)
        {
            int j=partition(a,s,e);
            quick(a,s,j-1);
            quick(a,j+1,e);
        }
    }
    static int partition(int a[],int s,int e)
    {
        int p=s,i=s+1,j=e;
        while(i<=j)
        {
            while(i<=e && a[p]>a[i])
            {
                i++;
            }
            while(j>=0 && a[j]>a[p])
            {
                j--;
            }
            if(i<j)
            {
                int k=a[i];
                a[i]=a[j];
                a[j]=k;
            }
        }
        int t=a[p];
        a[p]=a[j];
        a[j]=t;
        
        return j;
    }
}