import java.util.Arrays;
import java.util.Scanner;

import java.util.Scanner;
class sorting
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int min=i;
            for(int j=i;j<n;j++)
            {
                if(a[min]>a[j])
                {
                    min=j;
                }
            }
            int t=a[i];
            a[i]=a[min];
            a[min]=t;
        }
        System.out.print(Arrays.toString(a));
    }
}
