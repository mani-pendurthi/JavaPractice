package exception_handling;
import java.util.Scanner;

import AtmPin.InvalidAtmPinException;
public class Atm
{

	static Scanner sc=new Scanner(System.in);
	int atm;
	Atm(int a)
	{
		atm=a;
	}
	void validate(int pin)throws InvalidAtmPinException
	{
		//try
		//{
			if(atm==pin)
			{
				System.out.println("Welcome");
			}
			else
			{
				throw new InvalidAtmPinException("Invalid Atm pin");
			}
		//}
		//catch(InvalidAtmPinException e)
		//{
			//System.out.println(e);
		//}
		System.out.println("OK");
		
		
	}
	public static void main(String[] args) throws InvalidAtmPinException
	{
		Atm obj=new Atm(sc.nextInt());
		obj.validate(sc.nextInt());
	}

}
