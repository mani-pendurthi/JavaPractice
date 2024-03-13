import java.util.*;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int min=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            min=i;
            for(int j=i+1;j<n;j++)
            {
                if(a[min]>a[j])
                {
                    min=j;
                }
            }
            int t=a[min];
            a[min]=a[i];
            a[i]=t;
        }
        System.out.print(Arrays.toString(a));
    }
}