import java.util.*;
class Main
{
  public static void main(String[]args)
  {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int c=count(n);
	int a[]=new int[c];
	int ind=0,t;
	
	while(n>0)
	{
	    int r=n%10;
	    a[ind++]=r;
	    n/=10;
	}
	for(int i=0;i<c;i++)
	{
	    for(int j=i+1;j<c;j++)
	    {
	        if(a[i]>a[j])
	        {
	            t=a[i];
	            a[i]=a[j];
	            a[j]=t;
	        }
	    }
	}
	for(int i=0;i<c;i++)
	{
	    for(int j=1;j<=a[i];j++)
	    {
	        System.out.print(a[i]+" ");
	    }
	}
  }
  static int count(int n)
  {
      int c=0;
      while(n>0)
      {
          n/=10;
          c++;
      }
    return c;
  }
}