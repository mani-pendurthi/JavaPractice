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
        int k=sc.nextInt();
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    int t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        int s=0;
        int e=n-1;
        while(s<=e)
        {
            int m=(s+e)/2;
            if(a[m]==k)
            {
                System.out.print("Element found");
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
            System.out.print("Element not found");
        }
        
    }
}