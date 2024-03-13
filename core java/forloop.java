import java.util.*;
class A 
{
	
	public static void main(String []args)
	{
		Scanner obj=new Scanner (System.in);

		System.out.print("Enter starting value-");
		int a=obj.nextInt();
		System.out.print("Enter ending value-");
		int b=obj.nextInt();

		for (int i=a;i<=b;i+=2)
		{
			System.out.print(i+" ");
		}

	}


}