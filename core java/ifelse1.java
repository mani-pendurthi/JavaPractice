import java.util.*;

class A 
{
	
	public static void main (String [] args) 
	{
		
		Scanner obj=new Scanner(System.in);
		
		System.out.print("Enter A Value-");
		int a=obj.nextInt();
		System.out.print("Enter B Value-");
		int b=obj.nextInt();
		System.out.print("Enter C Value-");
		int c=obj.nextInt();
		
		if(a>b && a>c) 
		{
			System.out.print("A is greater-"+a);
		}
		else 
		{
			if(b>c)
			{
				System.out.print("B is greater-"+b);
			}
			else
			{
				System.out.print("C is greater-"+c);
			}
		}
	}
}
			
			
				
		