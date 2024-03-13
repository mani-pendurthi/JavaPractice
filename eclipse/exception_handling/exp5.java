package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exp5 {

	static void m2(int a,int b)
	{
		try
		{
			System.out.print(a/b);
		}
		catch(ArithmeticException e)
		{
			//e.printStackTrace();
			//System.out.println(e.getMessage());
			//System.out.println(e);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			m2(a,b);
		}
		catch(InputMismatchException x)
		{
			System.out.print("Invalid input");
		}
	}
}
