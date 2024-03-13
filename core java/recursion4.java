import java.util.Scanner;
class Main
{
  public static void main(String []args)
  {
	Scanner sc=new Scanner (System.in);
	int n=sc.nextInt();
	int p=n;

	if(n==1)
	{
	  System.out.print("1 is not a Prime Number");
	}
	else
	{
	  prime(n-1,p);
	}
  }
  static void prime(int a,int p)
  {
	if(a>=2)
	{
	  if(p%a==0)
	  {
	    System.out.println("Not a Prime Number");
	    a=0;
	  }
	  prime(a-1,p);
	}
	else if(a>0)
	{
	  System.out.print("Prime Number");
	}
  }
}