import java.util.Arrays;
import java.util.Scanner;

class bubblesorting
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] =t;
                }
            }

        }
        System.out.print(Arrays.toString(a));

    }
}
