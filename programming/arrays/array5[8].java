//MERGE SORT
import java.util.*;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int  i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        mergesort(a,0,n-1);
        System.out.print(Arrays.toString(a));
    }
    static void mergesort(int a[],int s,int e)
    {
        if(s<e)
        {
            int m=(s+e)/2;
            mergesort(a,s,m);
            mergesort(a,m+1,e);
            merge(a,s,m,m+1,e);
        }
    }
    static void merge(int a[],int ls,int le,int rs,int re)
    {
        int las=le-ls+1;
        int la[]=new int[las];
        for(int i=0;i<las;i++)
        {
            la[i]=a[ls+i];
        }
        int ras=re-rs+1;
        int ra[]=new int[ras]; 
        for(int i=0;i<ras;i++)
        {
            ra[i]=a[rs+i];
        }
        int i=0,j=0,k=ls;
        
        while(i<las && j<ras)
        {
            if(la[i]>ra[j])
            {
                a[k]=ra[j];
                k++;
                j++;
            }
            else
            {
                a[k]=la[i];
                k++;
                i++;
            }
        }
        while(i<las)
        {
            a[k]=la[i];
            k++;
            i++;
        }
        while(j<ras)
        {
            a[k]=ra[j];
            k++;
            j++;
        }
    }
}