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
        for(int i=0;i<n;i++)
        {
		  int t=a[i],j=0;
            for(j=i-1;j>=0;j--)
            {
               if(a[j]>t)
               {
                  a[j+1]=a[j];
               }
			else
			{
			   break;
			}
            }
            a[j+1]=t;
        }
        System.out.print(Arrays.toString(a));
    }
}