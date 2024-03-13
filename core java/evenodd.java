import java.util.*;
class A
{
	public static void main(String [] args)
	{
	Scanner obj=new Scanner (System.in);
	System.out.print("Enter a number=");
	int a=obj.nextInt();
		if(a>0) 
		{
			System.out.print("("+a+")"+" "+"Is a positive number");
		}
		else
		{
			System.out.print("("+a+")"+" "+"Is a negative number");
		}
		
	}
}