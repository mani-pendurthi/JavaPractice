import java.util.Scanner;
class A
{

  public static void main(String []args)
  {  
    Scanner obj=new Scanner (System.in);

    System.out.print("Enter A value=");
    int n=obj.nextInt();
	
	int prime=0;
     for (int i=2;i<n;i++)
	{
		if(n%i==0)
		{
			prime=prime+1;
		}
		
	}
	if (prime==0)
	{
		System.out.print("Prime number");
	}
     else
	{
		System.out.print("Not a prime number");
	}
  }

}