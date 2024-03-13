import java.util.*;

class A
{

public static void main(String []args)
{
	Scanner obj=new Scanner (System.in);
	
	System.out.print("A=");
	int a =obj.nextInt();

	if (a>=100 && a<=1000)
	{
		
		if(a%2==0)
		{
			float even=a%3;
			System.out.print("A%3="+even);
		}
		else
		{
			float odd=a%2;
			System.out.print("A%2="+odd);
		}
	
	}
	else 
	{
		System.out.print("Wrong number");
	}




}


}