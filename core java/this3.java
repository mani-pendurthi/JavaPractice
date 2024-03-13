/*create java app to satisfy This at constructor level.*/
import java.util.Scanner;
class A
{
	static Scanner sc=new Scanner(System.in);
	A(int a)
	{
		this(sc.nextFloat(),sc.nextInt());
	}
	A()
	{
		this(sc.nextInt());
	}
	A(float x,int y)
	{
		this(sc.next().charAt(0),sc.nextBoolean(),sc.nextDouble());
	}
	A(char r,boolean b,double d)
	{
		System.out.print("4th constructor");
	}

	public static void main(String []args)
	{
		A obj=new A();	
	}
}