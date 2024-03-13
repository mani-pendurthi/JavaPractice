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
	int x=a[0];
	for(int i=1;i<=a[1];i++)
	{
	    System.out.print(x+" ");
	    if(i%2==1)
	    {
	        x=x+a[2];
	    }
	    else
	    {
	        x=x+a[3];
	    }
	    
	}
  }
}