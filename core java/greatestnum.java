import java.util.*;
class A
{

public static void main(String []args)
{
	Scanner object=new Scanner (System.in);

	System.out.print("Enter a number=");
	int a=object.nextInt();
	System.out.print("Enter a number=");
	int b=object.nextInt();
	System.out.print("Enter a number=");
	int c=object.nextInt();
	
	if(a>b && a>c)
	{
		System.out.println("Greater number="+a);
	}
	else if(b>c)
	{
		System.out.println("Greater number="+b);
	
	}
	else 
	{
		System.out.println("Greater number="+c);
	}

}

}