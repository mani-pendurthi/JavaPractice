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
	    n/=10;
	    a[ind++]=r;
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
	    if(a[0]==0)
	    {
	        if(a[i]!=0)
	        {
	            t=a[0];
	            a[0]=a[i];
	            a[i]=t;
	        }
	    }
	}
	System.out.print(Arrays.toString(a));
  }
  static int count(int n)
  {
      int t=n,c=0;
      while(t>0)
      {
          t/=10;
          c++;
      }
    return c;
  }
}