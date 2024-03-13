import java.util.*;

class A
{

public static void main(String []args)
{
	Scanner obj=new Scanner (System.in);
	
	System.out.print("A=");
	int a =obj.nextInt();

	if (a>=0 && a<=100)
	{
		
		if(a>=90 && a<=100)
		{
			System.out.print("Super Smart");
		}
		else if(a>=80 && a<=90)
		{
			System.out.print("Smart");
		}
		else if(a>=70 && a<=80)
		{
			System.out.print("Smart Enough");
		}
		else if(a>=60 && a<=70)
		{
			System.out.print("Just Smart");
		}
		else if(a>=35 && a<=60)
		{
			System.out.print("No Smart");
		}
		else if(a>=0 && a<=35)
		{
			System.out.print("Dump");
		}
	
	}
	else 
	{
		System.out.print("Invalid input");
	}

}
}