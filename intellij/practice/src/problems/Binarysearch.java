import java.util.Scanner;
class Binarysearch
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
        int k=sc.nextInt();
        int m=0;
        for(int i=0;i<n;i++)
        {
            m=0;
            for(int j=0;j<n-1-i;j++)
            {
                if(a[j]>a[j+1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                    m++;
                }
            }
            if(m==0)
            {
                break;
            }
        }
        int s=0,e=n-1;
        m=0;
        while(s<=e)
        {
            m=(e+s)/2;
            if(a[m]==k)
            {
                System.out.print("Found");
                break;
            }
            else if(a[m]<k)
            {
                s=m+1;
            }
            else
            {
                e=m-1;
            }
        }
        if(s>e)
        {
            System.out.print("Not Found");
        }
    }
}