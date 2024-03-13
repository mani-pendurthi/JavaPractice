import java.util.Arrays;
import java.util.Scanner;
class sample
{
    public static void main(String[] args)
    {
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           int c=0,max=0;
           int a[]=new int[n];
           for(int i=0;i<n;i++)
           {
               a[i]=sc.nextInt();
           }
           for(int i=0;i<n;i++)
           {
               for(int j=0;j<n-1-i;j++)
               {
                   if(a[j]>a[j+1])
                   {
                       int t=a[j];
                       a[j]=a[j+1];
                       a[j+1]=t;
                   }
               }
           }
           for(int i=0;i<n;i++)
           {
               c=0;
               for(int j=0;j<i;j++)
               {
                   if(a[i]==a[j])
                   {
                       c++;
                   }
               }
               if(c==0)
               {
                   for(int j=0;j<n;j++)
                   {
                       if(a[i]==a[j])
                       {
                           c++;
                       }
                   }
                   if(max<c)
                   {
                       max=c;
                   }
               }
           }
           for(int i=max;i>=1;i--)
           {
               for(int j=0;j<n;j++)
               {
                   c=0;
                   for(int k=0;k<j;k++)
                   {
                       if(a[j]==a[k])
                       {
                           c++;
                       }
                   }
                   if(c==0)
                   {
                       for(int k=0;k<n;k++)
                       {
                           if(a[j]==a[k])
                           {
                               c++;
                           }
                       }
                       if(c==i)
                       {
                           System.out.println(a[j]+" "+c);
                       }
                   }
               }
           }
    }
}